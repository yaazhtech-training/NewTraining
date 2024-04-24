package com.yaazhtech.employeeData.controller;

public class LinkedList<S> {
    public static void main(String args[])
    {
        // Creating object of the
        // class linked list
        java.util.LinkedList<Integer> ll = new java.util.LinkedList<>();

        // Adding elements to the linked list
        ll.add(1);
        ll.add(2);
        ll.addLast(3);
        ll.addFirst(4);
        ll.add(2, 5);

        System.out.println(ll);

        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}
