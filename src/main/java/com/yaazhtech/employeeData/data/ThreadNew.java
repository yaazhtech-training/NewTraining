package com.yaazhtech.employeeData.data;

public class ThreadNew {

    public static void main(String args[]){
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
