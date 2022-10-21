package com.microservices.CitizenService.repository;

import com.microservices.CitizenService.entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CitizenRepo extends JpaRepository<Citizen, Integer> {
    List<Citizen> findByVaccinationCenterId(Integer id);
}
