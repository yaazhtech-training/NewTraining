package com.yaazhtech.employeeData.serialization;

import java.io.Serializable;

public class CreditCard implements Serializable {

    // what is serialization why we need this?
    // why we use transient keyword for any attribute when we need this.
   private final Long serialVersionUID=39324890343L; // serizalized , desir with ID 39324890343L or withoutID
    String cardNo;
    transient String cvv;// 0
    String expiryDateFrom;
    String expiryDateTo;
    String nameOfTheCardHolder;
    String cardBankName;

    //ex:
    //1. deploy this code without serialversionUID
    // a. changing the attributes/stru of the class and redeploy it will not serilazie proper
    // you will deserilz exception. to avoid this we have to use/create serialVersionUID explicitly for every serializable class.

    //2. deploy this code with serialversionUID
    // you can change any no of time the strucgture of the seril class.




}
