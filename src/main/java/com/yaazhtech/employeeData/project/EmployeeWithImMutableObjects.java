package com.yaazhtech.employeeData.project;

public class EmployeeWithImMutableObjects {
    private String name;// name has own hashcode
    private String pan; // pan has own hashcode

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", pan='" + pan + '\'' +
                '}';
    }


}
