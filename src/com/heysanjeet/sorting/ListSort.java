package com.heysanjeet.sorting;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListSort {
    public static void main(String[] args) {
        int[] intArray = {1, 8, 6,10, 4, 5,2, 2, 9, 8,4, 10};

        //remove duplicate
        List<Integer> distinctIntList = Arrays.stream(intArray).boxed().sorted().distinct().collect(Collectors.toList());
        System.out.println(distinctIntList);

        System.out.println("--------------------------------");
        //find even no
        distinctIntList.stream().filter(val->val%2==0).forEachOrdered(System.out::println);

        System.out.println("--------------------------------");

        //sort
        List<Integer> sortedList = Arrays.stream(intArray).boxed().sorted()
                .collect(Collectors.toList());
        //System.out.println(sortedList);

        //Reverse order
        List<Integer> revSort = sortedList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
       // System.out.println(revSort);

        //Using parallel stream
        List<Integer> integerList = sortedList.parallelStream().sorted().collect(Collectors.toList());
        //integerList.forEach(System.out::println);

        integerList.stream().parallel().map(val->val+10).sorted()
                .filter(val->val%2==0).forEachOrdered(System.out::println);

    }
}
