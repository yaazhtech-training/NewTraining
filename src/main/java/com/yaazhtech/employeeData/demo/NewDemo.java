package com.yaazhtech.employeeData.demo;

public class NewDemo {
    public static void main(String a[]){
        LapTop obj1=new LapTop();
        obj1.model="HP";
        obj1.price=1050;
        LapTop obj2=new LapTop();
        obj2.model="HP";
        obj2.price=1000;
        boolean result=obj1.equals(obj2);
        System.out.println(result);
    }
}
