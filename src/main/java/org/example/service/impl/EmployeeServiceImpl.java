package org.example.service.impl;

import org.example.entity.Employee;
import org.example.repository.EmployeeRepository;
import org.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository repo;
    @Override
    public List<Employee> findAllEmployees() {
        return repo.findAllEmployees();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        if (employee != null) {
            Employee employee1 = repo.save(employee);
            return employee1;
        }
        return null;
    }

    @Override
    public List<Employee> findByField(String name) {
        return repo.findByName(name);
    }

}
