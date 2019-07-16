package com.tw.apistackbase.controller;

import com.tw.apistackbase.model.Employee;
import com.tw.apistackbase.respository.EmployeeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployController {

    @Autowired
    private EmployeeRespository employeeService;
    @GetMapping("/employees")
    public List<Employee> list() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee findById(@PathVariable String id) {
        return employeeService.findById(id);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteById(@PathVariable String id) {
        employeeService.deleteById(id);
    }

    @PostMapping("/employees")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }

    @PutMapping("/employees/{id}")
    public void updateById(@PathVariable String id,
                           @RequestBody String name,
                           @RequestBody int age,
                           @RequestBody String gender) {
        employeeService.updateById(id, name, age, gender);
    }
//
//    @GetMapping(value = "/employees", params = "ageMin")
//    public Employee findByAge(@RequestBody int age) {
//        return Respository.findByAge(age);
//    }
}
