package com.yaazhtech.employeeData.data;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="jenita")
public class EmployeeData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false)

    private Long id;
    private String employeeName;
    private String emailId;
    private String employeePan;
    private Float salary;
}
