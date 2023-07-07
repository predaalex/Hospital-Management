package com.cegeka.academy.bepatientshub4;

import com.cegeka.academy.bepatientshub4.controller.PatientFileController;
import com.cegeka.academy.bepatientshub4.service.PatientFileService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PatientFileControllerTest {
    @InjectMocks
    private PatientFileController patientFileController;

    @Mock
    private PatientFileService patientFileService;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testPostPatientFile() {

    }
}
