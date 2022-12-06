package com.trexis.code.challenge.servicechallenge.service;

import com.trexis.code.challenge.servicechallenge.entity.Department;
import com.trexis.code.challenge.servicechallenge.entity.Employee;
import com.trexis.code.challenge.servicechallenge.entity.EmployeeType;

import java.util.List;

public interface EmployeeService {

    public List<Employee> listAllEmployee();
    public Employee getEmployee(Long employeeId);
    public Employee createEmployee(Employee employee);
    public Employee updateEmployee(Employee employee);
    public  Employee deleteEmployee(Employee employee);
    public List<Employee> findByDepartment(Department department);
    public List<Employee> findByEmployeeType(EmployeeType employeeType);
    public List<Employee> findByManagerId(Long serviceId);
}
