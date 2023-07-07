package com.cegeka.academy.bepatientshub4.service;

import com.cegeka.academy.bepatientshub4.dto.PatientDTO;
import com.cegeka.academy.bepatientshub4.entity.Patient;
import java.util.List;

public interface PatientService {
    public PatientDTO getPatientByCNP(Long cnp);

    public List<PatientDTO> getAllPatients();

    public void createPatient(PatientDTO patient);
}
