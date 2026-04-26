package com.example.emply.service;

import com.example.emply.model.Employee;
import com.example.emply.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    // Create
    public Employee saveEmployee(Employee emp) {
        return repo.save(emp);
    }

    // Read all
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    // Read by ID
    public Employee getEmployeeById(Long id) {
        return repo.findById(id).orElse(null);
    }

    // Update
    public Employee updateEmployee(Long id, Employee emp) {
        Employee existing = repo.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(emp.getName());
            existing.setDepartment(emp.getDepartment());
            existing.setSalary(emp.getSalary());
            return repo.save(existing);
        }
        return null;
    }

    // Delete
    public void deleteEmployee(Long id) {
        repo.deleteById(id);
    }
}