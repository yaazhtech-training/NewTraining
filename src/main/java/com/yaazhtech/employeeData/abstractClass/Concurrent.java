package com.yaazhtech.employeeData.abstractClass;

import java.util.ArrayList;
import java.util.Iterator;

public class Concurrent {


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer value = it.next();

            if (value.equals(4))
              list.remove(value);
it.remove();
            System.out.println("List Value:" + value);
        }

    }
}
