package com.heysanjeet.datastructure.HashTable.interview;

import java.util.HashMap;

public class CommonItem {
    public static void main(String[] args) {
        int[] array1 = {2, 3, 5};
        int[] array2 = {1, 4, 5};

        System.out.println(itemInCommonOptimized(array1, array2));
    }

   //time- O(n)
    public static boolean itemInCommonOptimized(int array1[], int array2[]) {
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();
        for (int i = 0; i < array1.length; i++) {
            myHashMap.put(array1[i], true);
        }
        for (int j = 0; j < array2.length; j++) {
            if (myHashMap.get(array2[j]) != null) {
                return true;
            }
        }
        return false;
    }

    public static boolean itemInCommonNaive(int array1[], int array2[]) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
