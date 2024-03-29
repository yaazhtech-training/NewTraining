package com.yaazhtech.employeeData.repository;

import com.yaazhtech.employeeData.data.EmployeeData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<EmployeeData,Long> {

}
