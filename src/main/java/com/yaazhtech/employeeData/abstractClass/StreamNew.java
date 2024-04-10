package com.yaazhtech.employeeData.abstractClass;

import java.util.Arrays;
import java.util.List;

public class StreamNew {


    public static void main(String args[]){
        List<Integer> num= Arrays.asList(4,7,3,2,9,5);

        num.stream();
        num.forEach(n->System.out.println(n));
    }
}
