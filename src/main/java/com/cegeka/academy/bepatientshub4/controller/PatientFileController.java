package com.cegeka.academy.bepatientshub4.controller;

import com.cegeka.academy.bepatientshub4.dto.PatientFileDTO;
import com.cegeka.academy.bepatientshub4.entity.PatientFile;
import com.cegeka.academy.bepatientshub4.service.PatientFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;
import java.util.List;


@RestController
@RequestMapping("/be-patient")
public class PatientFileController {
    private final PatientFileService patientFileService;

    @Autowired
    public PatientFileController(PatientFileService patientFileService) {
        this.patientFileService = patientFileService;
    }

    @GetMapping("/patient-files")
    public List<PatientFile> getAllPatientFiles(@RequestParam(required = false) Long specializationId) {
            return patientFileService.getPatientFilesBySpecializationId(specializationId);

    }

    @GetMapping("/patient-files/{id}")
    public Optional<PatientFile> getPatientFile(@PathVariable Long id) {
        return patientFileService.getPatientFile(id);
    }


    @PostMapping(value = "/patient-file")
    public void savePatientFile(@RequestBody PatientFileDTO patientFileDTO) {
        patientFileService.createPatientFile(patientFileDTO);
    }

    @PutMapping(value = "/patient-file/{id}")
    public void updatePatientFile(@PathVariable Long id, @RequestBody PatientFileDTO patientFileDTO) {
        patientFileService.updatePatientFile(id, patientFileDTO);
    }
}
