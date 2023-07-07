package com.cegeka.academy.bepatientshub4.service;


import com.cegeka.academy.bepatientshub4.entity.InsuranceType;
import com.cegeka.academy.bepatientshub4.repository.TypeOfInsuranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeOfInsuranceService {
    @Autowired
    private TypeOfInsuranceRepository typeOfInsuranceRepository;

    public List<InsuranceType> getAllTypeOfInsurance() {
        return typeOfInsuranceRepository.findAll();
    }
}
