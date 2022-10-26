package com.microservice.VaccinationCenter.service;

import com.microservice.VaccinationCenter.entity.VaccinationCenter;
import com.microservice.VaccinationCenter.model.Citizen;
import com.microservice.VaccinationCenter.model.RequredResponse;
import com.microservice.VaccinationCenter.repository.CenterRepository;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CenterServiceImpl implements CenterService{

    @Autowired
    CenterRepository repository;

    @Autowired
    RestTemplate restTemplate;

    @Override
    public VaccinationCenter addCenter(VaccinationCenter vaccinationCenter) {
        return repository.save(vaccinationCenter);
    }

    @HystrixCommand(fallbackMethod = "handleCitizenDownTime")
    public RequredResponse getAllDataByCenterId(int id){
        RequredResponse requredResponse= new RequredResponse();
        VaccinationCenter center= repository.findByVaccinationCenterId(id);
        requredResponse.setCenter(center);

        List<Citizen> listOfCitizen=restTemplate.getForObject("http://CITIZEN-SERVICE/citizen/centerId/"+id, List.class);
        requredResponse.setCitizens(listOfCitizen);

        return requredResponse;
    }

    public RequredResponse handleCitizenDownTime(int id){
        RequredResponse requredResponse= new RequredResponse();
        VaccinationCenter center= repository.findByVaccinationCenterId(id);
        requredResponse.setCenter(center);
        return requredResponse;
    }
}
