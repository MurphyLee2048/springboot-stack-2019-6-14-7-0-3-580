package com.tw.apistackbase.service;

import com.tw.apistackbase.respository.EmployeeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployService {
    @Autowired
    private EmployeeRespository empolyeeRespository;

}
