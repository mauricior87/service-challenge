package com.trexis.code.challenge.servicechallenge.repository;

import com.trexis.code.challenge.servicechallenge.entity.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeTypeRepository extends JpaRepository<EmployeeType, Long> {
}
