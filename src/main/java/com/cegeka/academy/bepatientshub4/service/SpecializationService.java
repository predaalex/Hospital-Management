package com.cegeka.academy.bepatientshub4.service;

import com.cegeka.academy.bepatientshub4.entity.Specialization;

import java.util.List;

public interface SpecializationService {

    Specialization getSpecialization(Long id);

    List<Specialization> getAllSpecializations();


}
