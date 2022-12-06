package com.trexis.code.challenge.servicechallenge.controller;

import com.trexis.code.challenge.servicechallenge.entity.Department;
import com.trexis.code.challenge.servicechallenge.entity.Employee;
import com.trexis.code.challenge.servicechallenge.entity.EmployeeType;
import com.trexis.code.challenge.servicechallenge.service.DepartmentService;
import com.trexis.code.challenge.servicechallenge.service.EmployeeService;
import com.trexis.code.challenge.servicechallenge.service.EmployeeTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private EmployeeTypeService employeeTypeService;

    @GetMapping("/departmentCost/{departmentId}")
    public ResponseEntity<String> departmentCost(@PathVariable Long departmentId){
        Department department = departmentService.getDepartment(departmentId);
        if (null == department){
            return ResponseEntity.notFound().build();
        }
        List<Employee> employees = employeeService.findByDepartment(department);
        if (employees.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        int departmentCost = 0;
        for (Employee employee:employees){
            departmentCost += employee.getEmployeeType().getTypeCost();
        }
        String response = "Department Cost: "+Integer.toString(departmentCost);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/managerCost/{managerId}")
    public ResponseEntity<String> managerCost(@PathVariable Long managerId){
        Long IdManager = 1L;
        int managerCost = 0;
        Employee emplManager = employeeService.getEmployee(managerId);
        if(null == emplManager){
            return ResponseEntity.noContent().build();
        } else if (!IdManager.equals(emplManager.getEmployeeType().getTypeId())) {
            return ResponseEntity.notFound().build();
        }else {
            List<Employee> employees = employeeService.findByManagerId(managerId);
            if(employees.isEmpty()){
                return ResponseEntity.noContent().build();
            }
            for(Employee employee: employees){
                managerCost += employee.getEmployeeType().getTypeCost();
            }
        }
        String response = "Manager Cost: "+Integer.toString(managerCost);
        return ResponseEntity.ok(response);
    }

}
