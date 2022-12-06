package com.trexis.code.challenge.servicechallenge.service;

import com.trexis.code.challenge.servicechallenge.entity.Department;
import com.trexis.code.challenge.servicechallenge.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService{

    private final DepartmentRepository departmentRepository;

    @Override
    public List<Department> listAllDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartment(Long departmentId) {
        return departmentRepository.findById(departmentId).orElse(null);
    }

    @Override
    public Department createDepartment(Department department) {
        department.setStatus("CREATED");
        return departmentRepository.save(department);
    }

    @Override
    public Department updateDepartment(Department department) {
        Department departmentDB = getDepartment(department.getDepartmentId());
        if (departmentDB == null){
            return null;
        }
        departmentDB.setDepartmentName(department.getDepartmentName());
        departmentDB.setStatus("UPDATE");
        return departmentRepository.save(departmentDB);
    }

    @Override
    public Department deleteDepartment(Department department) {
        Department departmentDB = getDepartment(department.getDepartmentId());
        if (departmentDB == null){
            return null;
        }
        departmentDB.setStatus("DELETED");
        return departmentRepository.save(departmentDB);
    }
}
