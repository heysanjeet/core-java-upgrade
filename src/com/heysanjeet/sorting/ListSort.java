package com.heysanjeet.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListSort {
    public static void main(String[] args) {
        int[] intArray = {1, 8, 6, 4, 5, 2, 9, 8, 10};
        //sort
        List<Integer> sortedList = Arrays.stream(intArray).boxed().sorted()
                .collect(Collectors.toList());
        System.out.println(sortedList);

        //Reverse order
        List<Integer> revSort = sortedList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(revSort);
    }
}
