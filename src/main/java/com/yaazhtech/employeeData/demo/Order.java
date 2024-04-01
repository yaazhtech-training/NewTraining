package com.yaazhtech.employeeData.demo;

import java.util.List;

public class Order {
    private List<Product> productList;

   public void addProduct(Product product){
       product.add(product);
   }
    public double calculateTotalCost() {
        double totalCost = 0;
        for (Product product : productList) {
              totalCost=product.getProductCost()+totalCost;

        }
        return totalCost;
    }

    public void add(Order order) {
    }
}