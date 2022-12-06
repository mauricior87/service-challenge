package com.trexis.code.challenge.servicechallenge.repository;

import com.trexis.code.challenge.servicechallenge.entity.Department;
import com.trexis.code.challenge.servicechallenge.entity.Employee;
import com.trexis.code.challenge.servicechallenge.entity.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    public List<Employee> findByDepartment(Department department);

    public List<Employee> findByManagerId(Long managerId);

    public List<Employee> findByEmployeeType(EmployeeType employeeType);
}
