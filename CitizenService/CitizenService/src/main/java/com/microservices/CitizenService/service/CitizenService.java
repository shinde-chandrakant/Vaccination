package com.microservices.CitizenService.service;

import com.microservices.CitizenService.entity.Citizen;

import java.util.List;

public interface CitizenService {
    List<Citizen> getByVaccinationCenterId(Integer id);

    List<Citizen> findAll();
    Citizen addCitizen(Citizen citizen);
}
