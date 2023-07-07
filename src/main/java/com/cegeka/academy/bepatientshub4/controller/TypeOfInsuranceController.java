package com.cegeka.academy.bepatientshub4.controller;

import com.cegeka.academy.bepatientshub4.entity.InsuranceType;
import com.cegeka.academy.bepatientshub4.service.TypeOfInsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/be-patient")
public class TypeOfInsuranceController {
    private final TypeOfInsuranceService typeOfInsuranceService;

    @Autowired
    public TypeOfInsuranceController(TypeOfInsuranceService typeOfInsuranceService) {
        this.typeOfInsuranceService = typeOfInsuranceService;
    }

    @GetMapping("/type-of-insurance")
    public List<InsuranceType> getAllTypeOfInsurance() {
        return typeOfInsuranceService.getAllTypeOfInsurance();
    }
}
