package com.yaazhtech.employeeData.demo;

import java.util.Objects;

public class LapTop {
    String model;
    int price;
    public String toString(){
        return model+":"+price;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LapTop lapTop)) return false;
        return price == lapTop.price && Objects.equals(model, lapTop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }
}
