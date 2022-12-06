package com.trexis.code.challenge.servicechallenge;

import com.trexis.code.challenge.servicechallenge.entity.Department;
import com.trexis.code.challenge.servicechallenge.entity.Employee;
import com.trexis.code.challenge.servicechallenge.entity.EmployeeType;
import com.trexis.code.challenge.servicechallenge.repository.EmployeeRepository;
import com.trexis.code.challenge.servicechallenge.service.EmployeeService;
import com.trexis.code.challenge.servicechallenge.service.EmployeeServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class employeeServiceMockTest {
    @Mock
    private EmployeeRepository employeeRepository;

    private EmployeeService employeeService;

    @BeforeEach
    public void setup(){
        MockitoAnnotations.initMocks(this);
        employeeService = new EmployeeServiceImpl(employeeRepository);
        Employee newEmployee = Employee.builder()
                .employeeId(1L)
                .employeeName("Manager")
                .department(Department.builder().departmentId(1L).build())
                .employeeType(EmployeeType.builder().typeId(4L).build())
                .status("CREATED")
                 .build();

        Mockito.when(employeeRepository.findById(1L)).thenReturn(Optional.of(newEmployee));
    }

    @Test
    public void whenValidGetID_ThenReturnEployee(){
        Employee found = employeeService.getEmployee(1L);
        Assertions.assertThat(found.getEmployeeName()).isEqualTo("Manager");
    }
}
