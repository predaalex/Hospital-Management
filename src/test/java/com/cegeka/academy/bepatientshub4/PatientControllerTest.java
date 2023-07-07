package com.cegeka.academy.bepatientshub4;

import com.cegeka.academy.bepatientshub4.controller.PatientController;
import com.cegeka.academy.bepatientshub4.dto.PatientDTO;
import com.cegeka.academy.bepatientshub4.entity.PatientFile;
import com.cegeka.academy.bepatientshub4.service.PatientService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Date;

import static org.mockito.Mockito.when;
import static org.testng.AssertJUnit.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class PatientControllerTest {
    @InjectMocks
    private PatientController patientController;

    @Mock
    private PatientService patientService;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetPatientByCnp() {
        Long cnp = 123456789L;

        PatientDTO patient = new PatientDTO();

        patient.setCnp(cnp);
        patient.setNumber(123);
        patient.setSerial("xd");
        patient.setAddress("Acasa");
        patient.setGender("barbat");
        patient.setBirthDate(new Date());
        patient.setFirstName("Alex");
        patient.setLastName("Preda");
        ArrayList<PatientFile> patientFiles = new ArrayList<>();
        patientFiles.add(new PatientFile());
        patient.setPacientFiles(patientFiles);

        patientService.createPatient(patient);

        when(patientService.getPatientByCNP(cnp)).thenReturn(patient);

        PatientDTO result = patientController.getPatientByCnp(cnp);

        assertEquals(patient, result);
    }

}
