package com.microservice.VaccinationCenter.repository;

import com.microservice.VaccinationCenter.entity.VaccinationCenter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CenterRepository extends JpaRepository<VaccinationCenter, Integer> {

    VaccinationCenter findByVaccinationCenterId(Integer id);
}
