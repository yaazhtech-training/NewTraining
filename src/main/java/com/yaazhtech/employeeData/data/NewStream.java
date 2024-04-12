package com.yaazhtech.employeeData.data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NewStream {

    public static void main(String args[]){
        List<Integer> num= Arrays.asList(4,6,2,1,8,9,3);
       Stream<Integer> data= num.stream();
       Stream<Integer>sortedData=data.sorted();
        sortedData.forEach(n->System.out.println(n));

    }
}

