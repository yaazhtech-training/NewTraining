package com.yaazhtech.employeeData.demo;

public class Demo implements Runnable {
public static void main(String[] args){
    NonStatic.num1=9;
    NonStatic obj1=new NonStatic();
    NonStatic obj2=new NonStatic();
    obj1.num=2;
    obj2.num=3;
    }

    @Override
    public void run() {

    }
}
