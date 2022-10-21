package com.microservices.CitizenService.controller;

import com.microservices.CitizenService.entity.Citizen;
import com.microservices.CitizenService.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citizen")
public class CitizenController {

    @Autowired
    private CitizenService service;

    @GetMapping("/centerId/{id}")
    public ResponseEntity<List<Citizen>> getById(@PathVariable Integer id){
        List<Citizen> list= service.getByVaccinationCenterId(id);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Citizen>> getAll(){
        List<Citizen> list= service.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Citizen> addCitizen(@RequestBody Citizen citizen){
        Citizen citizen1= service.addCitizen(citizen);
        return new ResponseEntity<>(citizen1, HttpStatus.OK);
    }
}
