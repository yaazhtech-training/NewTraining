package com.yaazhtech.employeeData.abstractClass;

public class Abc {
    static Abc obj=new Abc();//static instance of class
    private Abc(){//created constructor in private


    }
    public static Abc getInstance(){//create method with static get instance

        return obj;
    }
}
