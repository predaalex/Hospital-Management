package com.cegeka.academy.bepatientshub4.controller;

import com.cegeka.academy.bepatientshub4.entity.Specialization;
import com.cegeka.academy.bepatientshub4.service.SpecializationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/be-patient")
public class SpecializationController {

    private final SpecializationService specializationService;

    @Autowired
    public SpecializationController(SpecializationService specializationService) {
        this.specializationService = specializationService;
    }

    @GetMapping("/specializations/{id}")
    public Specialization getSpecialization(@PathVariable Long id){
        return specializationService.getSpecialization(id);
    }

    @GetMapping("/specializations")
    public List<Specialization> getSpecializations(){
        return specializationService.getAllSpecializations();
    }
}
