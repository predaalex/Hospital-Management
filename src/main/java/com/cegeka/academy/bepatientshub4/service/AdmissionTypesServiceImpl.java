package com.cegeka.academy.bepatientshub4.service;

import com.cegeka.academy.bepatientshub4.entity.AdmissionType;
import com.cegeka.academy.bepatientshub4.repository.AdmissionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdmissionTypesServiceImpl implements AdmissionTypeService {
    private AdmissionTypeRepository admissionTypeRepository;

    @Autowired
    public AdmissionTypesServiceImpl( AdmissionTypeRepository admissionTypeRepository) {
        this.admissionTypeRepository = admissionTypeRepository;
    }
    @Override
    public List<AdmissionType> getAllAdmissionTypes() {
        return admissionTypeRepository.findAll();
    }
}
