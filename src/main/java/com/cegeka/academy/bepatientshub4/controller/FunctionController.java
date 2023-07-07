package com.cegeka.academy.bepatientshub4.controller;

import com.cegeka.academy.bepatientshub4.entity.Function;
import com.cegeka.academy.bepatientshub4.service.FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/be-patient")
public class FunctionController {

    private final FunctionService functionService;

    @Autowired
    public FunctionController(FunctionService functionService) {
        this.functionService = functionService;
    }

    @GetMapping("/functions")
    public List<Function> getAllFunctions() {
        return functionService.getAllFunctions();
    }

}