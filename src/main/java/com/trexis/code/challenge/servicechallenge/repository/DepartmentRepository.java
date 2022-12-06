package com.trexis.code.challenge.servicechallenge.repository;

import com.trexis.code.challenge.servicechallenge.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
