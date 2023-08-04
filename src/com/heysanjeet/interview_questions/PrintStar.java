package com.heysanjeet.interview_questions;

public class PrintStar {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
