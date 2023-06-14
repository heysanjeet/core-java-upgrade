package com.heysanjeet.collections.map_collection;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class TreeMapClient {
    public static void main(String[] args) {
        Map<String, String> cityMap = new TreeMap<>();
        cityMap.put("Bihar", "Patna");
        cityMap.put("Karnataka", "Bangalore");
        cityMap.put("Maharashtra", "Mumbai");

        System.out.println(cityMap);
    }

}
