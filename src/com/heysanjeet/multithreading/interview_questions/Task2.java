package com.heysanjeet.multithreading.interview_questions;

public class Task2 extends Thread {
    @Override
    public void run() {
        for (int i = 6; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
