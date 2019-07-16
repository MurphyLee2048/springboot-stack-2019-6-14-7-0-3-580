package com.tw.apistackbase.respository;

import com.tw.apistackbase.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@Repository
public class Respository implements EmployeeRespository {
    private static Map<String, Employee> map = new HashMap<>();

    static {
        map.put("1", new Employee("1", "murphy", 22, "female"));
        map.put("2", new Employee("2", "alex", 20, "male"));
        map.put("3", new Employee("3", "murphy", 18, "female"));
    }

    @Override
    public List<Employee> findAll() {
        return Respository.map.values().stream().collect(Collectors.toList());
    }

    @Override
    public Employee findById(String id) {
        return Respository.map.get(id);
    }

    @Override
    public void deleteById(String id) {
        Respository.map.remove(id);
    }

    @Override
    public void addEmployee(Employee employee) {
        String employeeId = UUID.randomUUID().toString();
        Respository.map.put(employeeId, employee);
    }

    @Override
    public void updateById(String id, String name, int age, String gender) {
        Employee employee = Respository.map.get(id);
        employee.setName(name);
        employee.setAge(age);
        employee.setGender(gender);
    }
}
