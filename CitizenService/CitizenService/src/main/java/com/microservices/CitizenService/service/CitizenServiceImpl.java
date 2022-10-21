package com.microservices.CitizenService.service;

import com.microservices.CitizenService.entity.Citizen;
import com.microservices.CitizenService.repository.CitizenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitizenServiceImpl implements CitizenService{

    @Autowired
    private CitizenRepo citizenRepo;

    @Override
    public List<Citizen> getByVaccinationCenterId(Integer id){
        return citizenRepo.findByVaccinationCenterId(id);
    }

    @Override
    public List<Citizen> findAll() {
        return citizenRepo.findAll();
    }

    @Override
    public Citizen addCitizen(Citizen citizen) {
        return citizenRepo.save(citizen);
    }
}
