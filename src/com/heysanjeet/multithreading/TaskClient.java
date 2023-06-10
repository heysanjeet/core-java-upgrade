package com.heysanjeet.multithreading;

public class TaskClient {
    public static void main(String[] args) {
        Task task = new Task();
        task.start();

        Task task2 = new Task();
        task2.start();
    }
}
