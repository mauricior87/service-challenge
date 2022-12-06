package com.trexis.code.challenge.servicechallenge.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "tbl_employee_type")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long typeId;
    private String typeName;
    private Integer typeCost;
    private String status;
}
