package com.cegeka.academy.bepatientshub4.service;

import com.cegeka.academy.bepatientshub4.dto.PatientDTO;
import com.cegeka.academy.bepatientshub4.entity.Patient;
import com.cegeka.academy.bepatientshub4.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {
    private PatientRepository patientRepository;

    @Autowired
    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }


    @Override
    public PatientDTO getPatientByCNP(Long cnp) {
        Optional<Patient> patient = patientRepository.findByCnp(cnp);
        PatientDTO patientDTO = new PatientDTO();

        if (patient.isPresent()) {
            setPatientDTOAttributes(patientDTO, patient.get());
            return patientDTO;
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Pacientul cu cnp-ul " + cnp + " nu a fost gasit");
        }
    }

    @Override
    public List<PatientDTO> getAllPatients() {
        List<Patient> patients = patientRepository.findAll();
        List<PatientDTO> patientsDTO = new ArrayList<>();

        for (Patient patient : patients) {
            PatientDTO patientDTO = new PatientDTO();
            patientsDTO.add(patientDTO);
            setPatientDTOAttributes(patientDTO, patient);
        }

        return patientsDTO;
    }

    @Override
    public void createPatient(PatientDTO patientDTO) {
        Patient patient = new Patient();

        setPatientAttributes(patientDTO, patient);

        patientRepository.save(patient);
    }

    private static void setPatientAttributes(PatientDTO patientDTO, Patient patient) {
        patient.setFirstName(patientDTO.getFirstName());
        patient.setLastName(patientDTO.getLastName());
        patient.setGender(patientDTO.getGender());
        patient.setBirthDate(patientDTO.getBirthDate());
        patient.setAddress(patientDTO.getAddress());
        patient.setCnp(patientDTO.getCnp());
        patient.setSerial(patientDTO.getSerial());
        patient.setNumber(patientDTO.getNumber());
        patient.setPacientFiles(patientDTO.getPacientFiles());
    }

    private static void setPatientDTOAttributes(PatientDTO patientDTO, Patient patient) {
        patientDTO.setFirstName(patient.getFirstName());
        patientDTO.setLastName(patient.getLastName());
        patientDTO.setGender(patient.getGender());
        patientDTO.setBirthDate(patient.getBirthDate());
        patientDTO.setAddress(patient.getAddress());
        patientDTO.setCnp(patient.getCnp());
        patientDTO.setSerial(patient.getSerial());
        patientDTO.setNumber(patient.getNumber());
        patientDTO.setPacientFiles(patient.getPacientFiles());
    }


}
