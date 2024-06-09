package org.example.demojpa.controller;
import lombok.AllArgsConstructor;
import org.example.demojpa.model.Employee;
import org.example.demojpa.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor
public class EmployeeController {
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
}
