package com.yaazhtech.employeeData.demo;

import com.yaazhtech.hashmap.CalculateUser;

public class CalculateTotalCost {

    public static void main(String[] args){
        CalculateUser calculateUser=new CalculateUser();
        User user=new User();
        Order order=new Order();
        order.addProduct(new Product("Pencil","20","stationary"));
        order.addProduct(new Product("pen","30","stationary"));
        user.addOrder(order);
        User jenita=new User();
        Order order1=new Order();
        order1.addProduct(new Product("car","200","toys"));
        order1.addProduct(new Product("barbie","300","toys"));
        jenita.addOrder(order1);
        calculateUser.addUser(order);
        calculateUser.addUser(order1);

        System.out.println("");

    }
}
