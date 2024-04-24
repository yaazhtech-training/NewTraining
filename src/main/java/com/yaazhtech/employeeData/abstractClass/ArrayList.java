package com.yaazhtech.employeeData.abstractClass;

public class ArrayList {
    public static void main(String args[])
    {
        // Creating an Array of string type
        java.util.ArrayList<String> al = new java.util.ArrayList<>();

        // Adding elements to ArrayList
        // Custom inputs
        al.add("suresh");
        al.add("yaazhtech");

        // Here we are mentioning the index
        // at which it is to be added
        al.add(1, "For");

        // Printing all the elements in an ArrayList
        System.out.println(al);
    }
}

