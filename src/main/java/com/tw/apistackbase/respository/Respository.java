package com.tw.apistackbase.respository;

import com.tw.apistackbase.model.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

public class Respository {
    private static Map<String, Employee> map = new HashMap<>();

    static {
        map.put("1", new Employee("1", "murphy", 22, "female"));
        map.put("2", new Employee("2", "alex", 20, "male"));
        map.put("3", new Employee("3","murphy", 18, "female"));
    }

    public static List<Employee> findAll() {
        return map.values().stream().collect(Collectors.toList());
    }

    public static Employee findById(String id) {
        return map.get(id);
    }

    public static void deleteById(String id) {
        map.remove(id);
    }

    public static void addEmployee(Employee employee) {
        String employeeId = UUID.randomUUID().toString();
        map.put(employeeId, employee);
    }

    public static void updateById(String id, String name, int age, String gender) {
        Employee employee = map.get(id);
        employee.setName(name);
        employee.setAge(age);
        employee.setGender(gender);
    }

}
