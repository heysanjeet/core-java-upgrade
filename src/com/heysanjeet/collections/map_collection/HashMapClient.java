package com.heysanjeet.collections.map_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class HashMapClient {
    public static void main(String[] args) {
        filterAndMapOperations();

    }

    public static void filterAndMapOperations() {
//        Map<Integer, String> map = new HashMap<>();
        Map<Integer,String> map=new ConcurrentHashMap<>();
        map.put(1, "Sanjeet");
        map.put(2, "Sunil");
        map.put(3, "Manish");
        map.put(4, "Shivam");
        map.put(null,null);//not possible to insert null in ConcurrentHashMap
        System.out.println(map);


       /* Set<String> nameSet = map.entrySet().stream().filter(name -> {
            return name.getValue().startsWith("S");
        }).map(name -> {
            return name.getValue().toUpperCase();
        }).collect(Collectors.toSet());

        nameSet.add("Ruchikesh");
        nameSet.forEach(System.out::println);*/
    }
}
