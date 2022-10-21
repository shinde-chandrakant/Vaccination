package com.microservice.VaccinationCenter.model;

import com.microservice.VaccinationCenter.entity.VaccinationCenter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequredResponse {

    private VaccinationCenter center;
    private List<Citizen> citizens;
}
