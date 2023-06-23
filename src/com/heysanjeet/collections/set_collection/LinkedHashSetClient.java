package com.heysanjeet.collections.set_collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetClient {
    public static void main(String[] args) {
        Set<Integer> integerSet=new LinkedHashSet<>();
        integerSet.add(45);
        integerSet.add(34);
        integerSet.add(12);
        integerSet.add(1);

        integerSet.forEach(System.out::println);
    }
}
