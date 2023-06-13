package com.heysanjeet.multithreading.interview_questions;

public class ClientTask {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        task1.start();
        task2.start();

    }
}
