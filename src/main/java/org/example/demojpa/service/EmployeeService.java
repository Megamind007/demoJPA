package org.example.demojpa.service;
import lombok.AllArgsConstructor;
import org.example.demojpa.model.Employee;
import org.example.demojpa.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class EmployeeService {
    private EmployeeRepository employeeRepository;
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

}

