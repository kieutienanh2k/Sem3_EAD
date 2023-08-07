package org.example.service;

import org.example.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAllEmployees();
    Employee createEmployee(Employee employee);
    List<Employee> findByField(String name);
}
