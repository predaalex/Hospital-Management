package com.cegeka.academy.bepatientshub4.controller;

import com.cegeka.academy.bepatientshub4.dto.PatientDTO;
import com.cegeka.academy.bepatientshub4.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/be-patient")
public class PatientController {
    private final PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping(value = "/patients/{cnp}")
    public PatientDTO getPatientByCnp(@PathVariable Long cnp) {
        return patientService.getPatientByCNP(cnp);
    }
    @GetMapping("/patients")
    public List<PatientDTO> getPatients() {
        return patientService.getAllPatients();
    }

}
