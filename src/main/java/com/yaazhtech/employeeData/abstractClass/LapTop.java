package com.yaazhtech.employeeData.abstractClass;
//Equals example
public class LapTop {
    String name;
    String price;
    public String toString(){
        return "hi";
}
}
class Demo{

    public static  void main(String args[]){
        LapTop l1=new LapTop();
        l1.name="HP";
        l1.price="1000";
        LapTop l2=new LapTop();
        l2.name="Hp";
        l2.price="1000";
        boolean result=l1.equals(l2);
        System.out.println(result);
    }
}