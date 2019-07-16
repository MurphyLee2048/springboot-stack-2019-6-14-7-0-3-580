package com.tw.apistackbase.respository;

import com.tw.apistackbase.model.Employee;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;


public interface EmployeeRespository {
    List<Employee> findAll();

    Employee findById(String id);

    void deleteById(String id);

    void addEmployee(Employee employee);

    void updateById(String id, String name, int age, String gender);
}
