package com.cegeka.academy.bepatientshub4.service;

import com.cegeka.academy.bepatientshub4.entity.PatientFile;
import com.cegeka.academy.bepatientshub4.repository.PatientFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.cegeka.academy.bepatientshub4.dto.PatientFileDTO;
import com.cegeka.academy.bepatientshub4.entity.InsuranceType;
import com.cegeka.academy.bepatientshub4.entity.PatientFile;
import com.cegeka.academy.bepatientshub4.repository.InsuranceTypeRepository;
import com.cegeka.academy.bepatientshub4.repository.PatientFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;
import java.util.Optional;

@Service
public class PatientFileServiceImpl implements PatientFileService {
    PatientFileRepository patientFileRepository;
    InsuranceTypeRepository insuranceTypeRepository;

    @Autowired
    public PatientFileServiceImpl(PatientFileRepository patientFileRepository, InsuranceTypeRepository insuranceTypeRepository) {
        this.patientFileRepository = patientFileRepository;
        this.insuranceTypeRepository = insuranceTypeRepository;
    }

    @Override
    public Optional<PatientFile> getPatientFile(Long id) {
        return patientFileRepository.findById(id);
    }

    @Override
    public List<PatientFile> getPatientFilesBySpecializationId(Long specializationId) {
        if (specializationId != null && specializationId > 0) {
            return patientFileRepository.findByRoom_Specialization_Id(specializationId);
        } else {
            return patientFileRepository.findAll();
        }

    }

    @Override
    public void createPatientFile(PatientFileDTO patientFileDTO) {
        PatientFile patientFile = new PatientFile();

        setPatientFileAttributes(patientFile, patientFileDTO);


        patientFileRepository.save(patientFile);
    }

    @Override
    public void updatePatientFile(Long id, PatientFileDTO patientFileDTO) {
        Optional<PatientFile> optionalPatientFile = patientFileRepository.findById(id);

        if (optionalPatientFile.isPresent()) {
            PatientFile patientFile = optionalPatientFile.get();
            setPatientFileAttributes(patientFile, patientFileDTO);
            patientFileRepository.save(patientFile);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "id of Patient File NOT FOUND");
        }
    }


    private void setPatientFileAttributes(PatientFile patientFile, PatientFileDTO patientFileDTO) {
        patientFile.setInsured(patientFileDTO.getIsInsured());

        if (patientFileDTO.getAdmissionDate() != null)
            patientFile.setAdmissionDate(patientFileDTO.getAdmissionDate());
        if (patientFileDTO.getDischargeDate() != null)
            patientFile.setAdmissionDate(patientFileDTO.getDischargeDate());
        if (patientFileDTO.getInitialDiagnosis() != null)
            patientFile.setInitialDiagnosis(patientFileDTO.getInitialDiagnosis());
        if (patientFileDTO.getSeventyTwoHourDiagnosis() != null)
            patientFile.setSeventyTwoHourDiagnosis(patientFileDTO.getSeventyTwoHourDiagnosis());
        if (patientFileDTO.getFinalDiagnosis() != null)
            patientFile.setFinalDiagnosis(patientFileDTO.getFinalDiagnosis());
        if (patientFileDTO.getMedicTeam() != null)
            patientFile.setMedicTeam(patientFileDTO.getMedicTeam());
        if (patientFileDTO.getSurgeryDetails() != null)
            patientFile.setSurgeryDetails(patientFile.getSurgeryDetails());
        if (patientFileDTO.getSurgeryDate() != null)
            patientFile.setSurgeryDate(patientFileDTO.getSurgeryDate());
        if (patientFileDTO.getHistoryAntecedents() != null)
            patientFile.setHistoryAntecedents(patientFileDTO.getHistoryAntecedents());
        if (patientFileDTO.getHistoryLivingWorkingConditions() != null)
            patientFile.setHistoryLivingWorkingConditions(patientFileDTO.getHistoryLivingWorkingConditions());
        if (patientFileDTO.getHistoryBehaviors() != null)
            patientFile.setHistoryBehaviors(patientFile.getHistoryBehaviors());
        if (patientFileDTO.getHistoryMedicationBeforeHospitalization() != null)
            patientFile.setHistoryMedicationBeforeHospitalization(patientFileDTO.getHistoryMedicationBeforeHospitalization());
        if (patientFileDTO.getHistoryDisease() != null)
            patientFile.setHistoryDisease(patientFileDTO.getHistoryDisease());
        if (patientFileDTO.getHistoryGeneralClinicalExamination() != null)
            patientFile.setHistoryGeneralClinicalExamination(patientFileDTO.getHistoryGeneralClinicalExamination());
        if (patientFileDTO.getHistoryDisease() != null)
            patientFile.setHistoryDisease(patientFileDTO.getHistoryDisease());
        if (patientFileDTO.getSurgeryDetails() != null)
            patientFile.setSurgeryDetails(patientFileDTO.getSurgeryDetails());

        Optional<InsuranceType> optionalInsuranceType = insuranceTypeRepository.findByInsuranceType(
                patientFileDTO.getInsuranceType().getInsuranceType()
        );
        optionalInsuranceType.ifPresentOrElse(
                patientFile::setInsuranceType,
                () -> {
                    throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Insurance Type NOT FOUND");
                }
        );

    }
}

