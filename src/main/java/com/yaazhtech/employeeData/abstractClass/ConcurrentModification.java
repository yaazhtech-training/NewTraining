package com.yaazhtech.employeeData.abstractClass;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModification {

    public static void main(String[] args) {

        Map<Integer, String> map = new ConcurrentHashMap<Integer,String>();
        map.put(1, "jeni");
        map.put(2, "joanna");
        map.put(3,"japhia");

        Iterator<Integer> it = map.keySet().iterator();
        while(it.hasNext()) {
            Integer key = it.next();
            System.out.println(key);
            if (key.equals(2)) {
                map.put(1, "joyce");


            }
        }
    }
}
//This example works completely fine as while the iterator is iterating over the map, the size of the map is not changing. Only the map is being updated in the if statement.