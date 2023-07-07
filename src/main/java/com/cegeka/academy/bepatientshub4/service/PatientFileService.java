package com.cegeka.academy.bepatientshub4.service;
import java.util.List;
import java.util.Optional;
import com.cegeka.academy.bepatientshub4.dto.PatientFileDTO;
import com.cegeka.academy.bepatientshub4.entity.PatientFile;
import org.springframework.stereotype.Service;

public interface PatientFileService {
    void createPatientFile(PatientFileDTO patientFileDTO);

    void updatePatientFile(Long id, PatientFileDTO patientFileDTO);

    Optional<PatientFile> getPatientFile(Long id);

    List<PatientFile> getPatientFilesBySpecializationId(Long specializatonId);

}
