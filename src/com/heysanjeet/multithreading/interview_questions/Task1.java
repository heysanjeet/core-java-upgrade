package com.heysanjeet.multithreading.interview_questions;

public class Task1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
