package com.trexis.code.challenge.servicechallenge.service;

import com.trexis.code.challenge.servicechallenge.entity.EmployeeType;
import com.trexis.code.challenge.servicechallenge.repository.EmployeeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeTypeServiceImpl implements EmployeeTypeService{

   @Autowired
   private EmployeeTypeRepository employeeTypeRepository;


    @Override
    public List<EmployeeType> listAllEmployeeType() {
        return employeeTypeRepository.findAll();
    }

    @Override
    public EmployeeType getEmployeeType(Long employeetypeId) {
        return employeeTypeRepository.findById(employeetypeId).orElse(null);
    }

    @Override
    public EmployeeType createEmployeeType(EmployeeType employeeType) {
        employeeType.setStatus("CREATED");
        return employeeTypeRepository.save(employeeType);
    }

    @Override
    public EmployeeType updateEmployeeType(EmployeeType employeeType) {
        EmployeeType employeeTypeDB = getEmployeeType(employeeType.getTypeId());
        if (null == employeeTypeDB ){
            return null;
        }
        employeeTypeDB.setTypeName(employeeType.getTypeName());
        employeeTypeDB.setTypeCost(employeeType.getTypeCost());
        employeeTypeDB.setStatus("UPDATED");
        return employeeTypeRepository.save(employeeTypeDB);
    }

    @Override
    public EmployeeType deleteEmployeeType(EmployeeType employeeType) {
        EmployeeType employeeTypeDB = getEmployeeType(employeeType.getTypeId());
        if (null == employeeTypeDB ){
            return null;
        }
        employeeTypeDB.setStatus("DELETED");
        return employeeTypeRepository.save(employeeTypeDB);
    }
}
