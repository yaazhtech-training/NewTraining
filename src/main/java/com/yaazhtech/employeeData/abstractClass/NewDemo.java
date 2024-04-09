package com.yaazhtech.employeeData.abstractClass;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NewDemo {



    public static void main(String args[]){
        List<Integer>nums= Arrays.asList(4,5,1,7,8);
       Stream<Integer> data=nums.stream();
        Stream<Integer>sortedData=  data.sorted();
        sortedData.forEach(n->System.out.println(n));//for each used to pick data one by one

    }
}
