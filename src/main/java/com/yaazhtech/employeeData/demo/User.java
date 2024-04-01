package com.yaazhtech.employeeData.demo;

import java.util.List;

public class User {

    private String userName;
    private List<Order> orderList;

    public void addOrder(Order order){
        order.add(order);
    }
    public List<Order>getOrderList(){
        return orderList;
    }

    public String getUserName() {
        return userName;
    }
}
