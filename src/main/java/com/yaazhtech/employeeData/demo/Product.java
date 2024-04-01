package com.yaazhtech.employeeData.demo;

public class Product {

    private String productName;
    private Double productCost;

    private String productCategory;

    public Product(String pencil, String number, String stationary) {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductCost() {
        return productCost;
    }

    public void setProductCost(Double productCost) {
        this.productCost = productCost;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public void add(Product product) {
    }
}
