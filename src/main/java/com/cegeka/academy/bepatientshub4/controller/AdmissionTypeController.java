package com.cegeka.academy.bepatientshub4.controller;

import com.cegeka.academy.bepatientshub4.entity.AdmissionType;
import com.cegeka.academy.bepatientshub4.service.AdmissionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/be-patient")
public class AdmissionTypeController {
    private final AdmissionTypeService admissionTypeService;

    @Autowired
    public AdmissionTypeController(AdmissionTypeService admissionTypeService) {
        this.admissionTypeService = admissionTypeService;
    }

    @GetMapping(value = "/admission-types")
    public List<AdmissionType> getAdmissionTypes() {
        return admissionTypeService.getAllAdmissionTypes();
    }
}
