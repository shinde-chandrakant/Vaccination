package com.microservice.VaccinationCenter.service;

import com.microservice.VaccinationCenter.entity.VaccinationCenter;
import com.microservice.VaccinationCenter.model.Citizen;
import com.microservice.VaccinationCenter.model.RequredResponse;

public interface CenterService {

    VaccinationCenter addCenter(VaccinationCenter vaccinationCenter);
    RequredResponse getAllDataByCenterId(int id);
}
