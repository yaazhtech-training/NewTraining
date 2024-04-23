package com.yaazhtech.employeeData.abstractClass;

public class NewHire {


    public static void main(String args[]){
        NewLaptop obj=new NewLaptop();
       obj.model="HP";
       obj.price=10000;
        NewLaptop obj1=new NewLaptop();
        obj1.model="HP";
        obj1.price=10000;
        boolean result=obj.equals(obj1);
        System.out.println(result);
    }
}
