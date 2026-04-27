package com.example.employee;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class EmployeeService {

    private Map<Integer, Employee> map = new HashMap<>();

    // CREATE
    public Employee addEmployee(Employee emp) {
        map.put(emp.getId(), emp);
        return emp;
    }

    // READ ALL
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(map.values());
    }

    // READ BY ID
    public Employee getEmployee(int id) {
        return map.get(id);
    }

    // UPDATE
    public Employee updateEmployee(int id, Employee emp) {
        map.put(id, emp);
        return emp;
    }

    // DELETE
    public String deleteEmployee(int id) {
        map.remove(id);
        return "Deleted Successfully";
    }
}