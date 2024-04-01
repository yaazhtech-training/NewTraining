package com.yaazhtech.employeeData.demo;

public class NewThread {

    public static void main(String a[]){
        Hi obj1=new Hi();
        Hello obj2=new Hello();
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
        t1.run();
        t2.run();

    }
}
