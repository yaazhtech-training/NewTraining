package com.yaazhtech.employeeData.data;
//thread
public class NewThread {


    public static void main(String args[]){
        Example s1=new Example();
        Demo s2=new Demo();

        s1.start();
        s2.start();

        s1.show();
        s2.show();
    }
}
