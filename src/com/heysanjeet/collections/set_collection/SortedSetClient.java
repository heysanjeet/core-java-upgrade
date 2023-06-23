package com.heysanjeet.collections.set_collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetClient {
    public static void main(String[] args) {

        SortedSet<Integer> sortedSet=new TreeSet<>();
        sortedSet.add(34);
        sortedSet.add(12);
        sortedSet.add(6);
        sortedSet.add(97);
        sortedSet.add(1);

        sortedSet.forEach(System.out::println);


    }
}
