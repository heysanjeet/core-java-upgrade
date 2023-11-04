package com.heysanjeet.datastructure.HashTable.interview;

public class CommonItem {
    public static void main(String[] args) {
        int[] array1 = {2, 3, 5};
        int[] array2 = {1, 4, 5};

        System.out.println(itemInCommonNaive(array1, array2));
    }

    public static boolean itemInCommonNaive(int array1[], int array2[]) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array1[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
