package com.microservice.VaccinationCenter.controller;

import com.microservice.VaccinationCenter.entity.VaccinationCenter;
import com.microservice.VaccinationCenter.model.RequredResponse;
import com.microservice.VaccinationCenter.service.CenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vaccinationcenter")
public class VaccinationCenterController {

    @Autowired
    private CenterService service;

    @PostMapping("/addCenter")
    public ResponseEntity<VaccinationCenter> addCitizen(@RequestBody VaccinationCenter vaccinationCenter){
        VaccinationCenter vaccinationCenter1= service.addCenter(vaccinationCenter);
        return new ResponseEntity<>(vaccinationCenter1, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RequredResponse> getAllData(@PathVariable int id){
        RequredResponse requredResponse= service.getAllDataByCenterId(id);
        return new ResponseEntity<>(requredResponse, HttpStatus.OK);
    }
}