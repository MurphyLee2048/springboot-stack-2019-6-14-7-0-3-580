package com.tw.apistackbase.controller;

import com.tw.apistackbase.model.Employee;
import com.tw.apistackbase.respository.respository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployController {
    @GetMapping("/employees")
    public List<Employee> list() {
        return respository.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee employee(@PathVariable String id) {
        return respository.findById(id);
    }
}
