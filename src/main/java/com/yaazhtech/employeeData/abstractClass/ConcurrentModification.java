package com.yaazhtech.employeeData.abstractClass;

import java.util.HashMap;
import java.util.Iterator;

public class ConcurrentModification {

    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3,3);

        Iterator<Integer> it = map.keySet().iterator();
        while(it.hasNext()) {
            Integer key = it.next();
            System.out.println("Map Value:" + map.get(key));
            if (key.equals(2)) {
                map.put(1, 4);


            }
        }
    }
}
//This example works completely fine as while the iterator is iterating over the map, the size of the map is not changing. Only the map is being updated in the if statement.