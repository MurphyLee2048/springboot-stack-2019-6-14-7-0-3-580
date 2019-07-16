package com.tw.apistackbase.controller;

import com.tw.apistackbase.model.Employee;
import com.tw.apistackbase.respository.Respository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployController {
    @GetMapping("/employees")
    public List<Employee> list() {
        return Respository.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee findById(@PathVariable String id) {
        return Respository.findById(id);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteById(@PathVariable String id) {
        Respository.deleteById(id);
    }

    @PostMapping("/employees")
    public void addEmployee(@RequestBody Employee employee) {
        Respository.addEmployee(employee);
    }

    @PutMapping("/employees/{id}")
    public void updateById(@PathVariable String id,
                           @RequestBody String name,
                           @RequestBody int age,
                           @RequestBody String gender) {
        Respository.updateById(id, name, age, gender);
    }
//
//    @GetMapping(value = "/employees", params = "ageMin")
//    public Employee findByAge(@RequestBody int age) {
//        return Respository.findByAge(age);
//    }
}
