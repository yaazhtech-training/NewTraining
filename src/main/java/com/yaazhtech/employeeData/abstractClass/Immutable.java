package com.yaazhtech.employeeData.abstractClass;

public class Immutable {


    private final String s;
    Immutable(final String s) {
        this.s = s;
    }
    public final String getName() {
        return s;
    }
    public static void main(String[] args) {
        Immutable obj = new Immutable("Core Java Training In Yaazhtech");
        System.out.println(obj.getName());
    }
}
