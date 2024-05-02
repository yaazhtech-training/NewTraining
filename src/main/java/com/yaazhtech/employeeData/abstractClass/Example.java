package com.yaazhtech.employeeData.abstractClass;

public class Example {

    //method declaration
    public int addNumbers(int num1,int num2){

        //method implementation
        int sum=num1+num2;
return sum;
    }
  public static void main(String args[]){
        Example obj=new Example();
        int result= obj.addNumbers(5,7);

        //display the result

      System.out.println("Result:"+result);
  }





}
