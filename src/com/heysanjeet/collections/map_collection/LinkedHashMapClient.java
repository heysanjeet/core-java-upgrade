package com.heysanjeet.collections.map_collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LinkedHashMapClient {
    public static void main(String[] args) {
        mapOperation();
    }

    public static void mapOperation() {
        Map<Integer, List<String>> map = new HashMap<>();
        map.put(1, Arrays.asList("Sanjeet", "Sunil", "Manish"));
        map.put(2, Arrays.asList("Ruchikesh", "Pinku", "Shivam"));

        List<String> names = map.entrySet().stream().findFirst().get().getValue();
        System.out.println(names);
    }
}
