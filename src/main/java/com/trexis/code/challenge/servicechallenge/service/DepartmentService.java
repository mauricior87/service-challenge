package com.trexis.code.challenge.servicechallenge.service;

import com.trexis.code.challenge.servicechallenge.entity.Department;

import java.util.List;

public interface DepartmentService {

    public List<Department> listAllDepartment();
    public Department getDepartment(Long departmentId);
    public Department createDepartment(Department department);
    public Department updateDepartment(Department department);
    public  Department deleteDepartment(Department department);
}
