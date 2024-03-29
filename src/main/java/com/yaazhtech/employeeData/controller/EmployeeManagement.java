package com.yaazhtech.employeeData.controller;

import com.yaazhtech.employeeData.data.EmployeeData;
import com.yaazhtech.employeeData.model.EmployeeInfo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface EmployeeManagement {


    @PostMapping("/save")
    public String saveEmployeeData(@RequestBody EmployeeInfo employeeInfo);

    @GetMapping("/getAllEmployee")//to retrieve all the list in the table
    public List<EmployeeData> getAllEmployee();


    @GetMapping("/{id}")//retrieve based on id
    public EmployeeData getEmployeeId(@PathVariable Long id);


    @DeleteMapping("/{id}")
    public void deleteEmployeeId(@PathVariable Long id);


    @PutMapping("/{id}")
    public EmployeeData updateEmployee(@PathVariable Long id, @RequestBody EmployeeData updateEmployee); //Modify the existing from our DB, EmployeeData-Tablename(it is out input we ar goin to modify the table data) //We give two inputs, id and employeeData(accesstable),updatedEmployee - result will be saved in this
}
