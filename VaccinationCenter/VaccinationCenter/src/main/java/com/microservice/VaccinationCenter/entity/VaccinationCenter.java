package com.microservice.VaccinationCenter.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="vaccination_center")
public class VaccinationCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="center_name")
    private String centerName;

    @Column(name="address")
    private String address;

//    @Column
    private int vaccinationCenterId;
}
