package com.cegeka.academy.bepatientshub4.service;

import com.cegeka.academy.bepatientshub4.entity.Specialization;
import com.cegeka.academy.bepatientshub4.repository.SpecializationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecializationServiceImpl implements SpecializationService {

    private final SpecializationRepository specializationRepository;


    public SpecializationServiceImpl(SpecializationRepository specializationRepository) {
        this.specializationRepository = specializationRepository;
    }


    @Override
    public Specialization getSpecialization(Long id) {
        return specializationRepository.findById(id).orElse(null);
    }

    @Override
    public List<Specialization> getAllSpecializations() {
        return specializationRepository.findAll();
    }
}
