package com.trexis.code.challenge.servicechallenge.service;

import com.trexis.code.challenge.servicechallenge.entity.Department;
import com.trexis.code.challenge.servicechallenge.entity.Employee;
import com.trexis.code.challenge.servicechallenge.entity.EmployeeType;
import com.trexis.code.challenge.servicechallenge.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    @Override
    public List<Employee> listAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(Long employeeId) {
        return employeeRepository.findById(employeeId).orElse(null);
    }

    @Override
    public Employee createEmployee(Employee employee) {
        employee.setStatus("CREATED");
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        Employee employeeDB = getEmployee(employee.getEmployeeId());
        if (null == employeeDB){
            return null;
        }
        employeeDB.setEmployeeName(employee.getEmployeeName());
        employeeDB.setEmployeeType(employee.getEmployeeType());
        employeeDB.setDepartment(employee.getDepartment());
        employeeDB.setManagerId(employee.getManagerId());
        employeeDB.setStatus("UPDATED");
        return employeeRepository.save(employeeDB);
    }

    @Override
    public Employee deleteEmployee(Employee employee) {
        Employee employeeDB = getEmployee(employee.getEmployeeId());
        if (null == employeeDB){
            return null;
        }
        employeeDB.setStatus("DELETED");
        return employeeRepository.save(employeeDB);
    }

    @Override
    public List<Employee> findByDepartment(Department department) {
        return employeeRepository.findByDepartment(department);
    }

    @Override
    public List<Employee> findByEmployeeType(EmployeeType employeeType) {
        return employeeRepository.findByEmployeeType(employeeType);
    }

    @Override
    public List<Employee> findByManagerId(Long managerId) {
        return employeeRepository.findByManagerId(managerId);
    }
}
