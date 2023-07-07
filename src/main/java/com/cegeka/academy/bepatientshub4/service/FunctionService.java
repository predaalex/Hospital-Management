package com.cegeka.academy.bepatientshub4.service;

import com.cegeka.academy.bepatientshub4.entity.Function;
import com.cegeka.academy.bepatientshub4.repository.FunctionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FunctionService {

    @Autowired
    private FunctionRepository functionRepository;

    public List<Function> getAllFunctions() {
        return functionRepository.findAll();
    }

}