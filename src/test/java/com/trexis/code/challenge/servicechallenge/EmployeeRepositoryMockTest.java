package com.trexis.code.challenge.servicechallenge;

import com.trexis.code.challenge.servicechallenge.entity.Department;
import com.trexis.code.challenge.servicechallenge.entity.Employee;
import com.trexis.code.challenge.servicechallenge.entity.EmployeeType;
import com.trexis.code.challenge.servicechallenge.repository.EmployeeRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
public class EmployeeRepositoryMockTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void whenFindByDepartment_thenReturnListEmployee(){
        Employee employee1 = Employee.builder()
                .employeeName("New QA Tester")
                .employeeType(EmployeeType.builder().typeId(2L).build())
                .department(Department.builder().departmentId(1L).build())
                .managerId(2L)
                .status("CREATED").build();
        employeeRepository.save(employee1);

        List<Employee> founds = employeeRepository.findByEmployeeType(employee1.getEmployeeType());

        Assertions.assertThat(founds.size()).isEqualTo(4);

    }
}
