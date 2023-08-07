package org.example.controller;

import org.example.entity.Employee;
import org.example.model.BaseResponse;
import org.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/employees")
    public BaseResponse getEmployeeAll(){
        BaseResponse res = new BaseResponse();
        res.data = employeeService.findAllEmployees();
        return res;
    }
    @PostMapping(value = "/employees")
    public BaseResponse  insertEmployee(@RequestBody Employee employee){
        BaseResponse res = new BaseResponse();
        List<Employee> listEmployee = employeeService.findByField(employee.getName());
        if (!listEmployee.isEmpty()) {
            return res;
        }
        res.data = employeeService.createEmployee(employee);
        return res;
    }
}
