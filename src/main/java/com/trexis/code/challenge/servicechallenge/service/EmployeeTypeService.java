package com.trexis.code.challenge.servicechallenge.service;


import com.trexis.code.challenge.servicechallenge.entity.EmployeeType;

import java.util.List;

public interface EmployeeTypeService {

    public List<EmployeeType> listAllEmployeeType();
    public EmployeeType getEmployeeType(Long employeetypeId);
    public EmployeeType createEmployeeType(EmployeeType employeeType);
    public EmployeeType updateEmployeeType(EmployeeType employeeType);
    public  EmployeeType deleteEmployeeType(EmployeeType employeeType);
}
