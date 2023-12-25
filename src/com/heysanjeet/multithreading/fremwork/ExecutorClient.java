package com.heysanjeet.multithreading.fremwork;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorClient {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            {
                try (BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\Sanjeet\\Downloads\\Ex_Files_Java_EE_Concurrency\\Exercise Files\\Chapter2\\02_04\\begin\\javaseconcurrency\\sample.txt")))) {
                    String line = null;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(Thread.currentThread().getName() + " Reading line " + line);
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        };

        Executor executor= Executors.newSingleThreadExecutor();
        executor.execute(runnable);

    }
}
