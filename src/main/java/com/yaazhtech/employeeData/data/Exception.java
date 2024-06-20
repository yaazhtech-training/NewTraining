package com.yaazhtech.employeeData.data;

public class Exception extends Throwable {

    public static void main(String args[]){
        int i=9;
        int j=0;
        int k=0;
        try {
            k = i / j;
        }
        catch (java.lang.Exception e) {
            System.out.println(k);
        }
        System.out.println("hi");
    }
}
