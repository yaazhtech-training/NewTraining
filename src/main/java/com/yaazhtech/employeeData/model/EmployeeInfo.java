package com.yaazhtech.employeeData.model;

import lombok.Data;

@Data
public class EmployeeInfo {
    private Long id;
    private String employeeName;
    private String emailId;
    private String employeePan;
    private Float salary;
}
