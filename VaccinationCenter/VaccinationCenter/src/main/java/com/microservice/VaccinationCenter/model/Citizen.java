package com.microservice.VaccinationCenter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Citizen {

    private int id;

    @Column
    private String name;

    @Column
    private int vaccinationCenterId;
}
