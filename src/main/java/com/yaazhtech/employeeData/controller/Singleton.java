package com.yaazhtech.employeeData.controller;

public class Singleton {

    public static Singleton obj;//only one instance so using static
    int i;
    private Singleton(){//private constructor
System.out.println("singleton");
    }
    public static Singleton getInstance() {
        if (obj == null) {
            obj = new Singleton();
        }
            return obj;
        }

}
