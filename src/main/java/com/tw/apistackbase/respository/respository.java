package com.tw.apistackbase.respository;

import com.tw.apistackbase.model.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class respository {
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
}
