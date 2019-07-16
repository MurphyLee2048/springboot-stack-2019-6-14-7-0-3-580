package com.tw.apistackbase.controller;

import com.tw.apistackbase.model.Employee;
import com.tw.apistackbase.respository.Respository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployController {

    @Autowired
    private Respository respository;

    @GetMapping("/employees")
    public List<Employee> list() {
        return respository.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee findById(@PathVariable String id) {
        return respository.findById(id);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteById(@PathVariable String id) {
        respository.deleteById(id);
    }

    @PostMapping("/employees")
    public void addEmployee(@RequestBody Employee employee) {
        respository.addEmployee(employee);
    }

    @PutMapping("/employees/{id}")
    public void updateById(@PathVariable String id,
                           @RequestBody String name,
                           @RequestBody int age,
                           @RequestBody String gender) {
        respository.updateById(id, name, age, gender);
    }
//
//    @GetMapping(value = "/employees", params = "ageMin")
//    public Employee findByAge(@RequestBody int age) {
//        return Respository.findByAge(age);
//    }
}
