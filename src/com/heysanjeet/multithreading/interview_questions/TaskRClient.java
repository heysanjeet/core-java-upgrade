package com.heysanjeet.multithreading.interview_questions;

public class TaskRClient {
    public static void main(String[] args) {
        TaskR taskR = new TaskR();
        Thread thread = new Thread(taskR);

        TaskR taskR2 = new TaskR();
        Thread thread2 = new Thread(taskR);
        thread2.start();
        thread.start();
    }
}
