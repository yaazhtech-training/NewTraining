package com.yaazhtech.employeeData.abstractClass;

public class Mutable {


    private String s;
    Mutable(String s) {
        this.s = s;
    }
    public String getName() {
        return s;
    }
    public void setName(String coursename) {
        this.s = coursename;
    }
    public static void main(String[] args) {
        Mutable obj = new Mutable("yaaztech");
        System.out.println(obj.getName());
// Here, we can update the name using the setName method.
        obj.setName("Java Training");
        System.out.println(obj.getName());
    }
}
