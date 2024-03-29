package com.yaazhtech.employeeData.controller;

import com.yaazhtech.employeeData.data.EmployeeData;
import com.yaazhtech.employeeData.model.EmployeeInfo;
import com.yaazhtech.employeeData.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class EmployeeController implements EmployeeManagement {

 @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public String saveEmployeeData(EmployeeInfo employeeInfo) {

        EmployeeData employeeData=new EmployeeData();

        employeeData.setId(employeeInfo.getId());
        employeeData.setEmployeeName(employeeInfo.getEmployeeName());
        employeeData.setEmployeePan(employeeInfo.getEmployeePan());
        employeeData.setEmailId(employeeInfo.getEmailId());
        employeeData.setSalary(employeeInfo.getSalary());
        employeeRepo.save(employeeData);
        return "EmployeeData Saved Successfully";
    }

    @Override
    public List<EmployeeData> getAllEmployee() {
        return employeeRepo.findAll();
    }

    @Override
    public EmployeeData getEmployeeId(Long id) {
        return employeeRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteEmployeeId(Long id) {
        employeeRepo.deleteById(id);
    }

    @Override
    public EmployeeData updateEmployee(Long id, EmployeeData updateEmployee) {

        EmployeeData existingEmployee = employeeRepo.findById(id).orElse(null);
        if(existingEmployee!=null)
        {
            existingEmployee.setEmployeePan(updateEmployee.getEmployeePan());
            existingEmployee.setSalary(updateEmployee.getSalary());
        }
        return employeeRepo.save(existingEmployee);
    }


}


