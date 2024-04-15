package com.yaazhtech.employeeData.repository;

import com.yaazhtech.employeeData.data.EmployeeData;
import com.yaazhtech.employeeData.data.TradeData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TradeRepo extends JpaRepository<TradeData,Long> {
}
