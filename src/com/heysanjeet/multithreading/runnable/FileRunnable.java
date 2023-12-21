package com.heysanjeet.multithreading.runnable;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//always prefer to use Runnable because we can implement another interface
public class FileRunnable implements Runnable {
    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\Sanjeet\\Downloads\\Ex_Files_Java_EE_Concurrency\\Exercise Files\\Chapter2\\02_04\\begin\\javaseconcurrency\\sample.txt")))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(Thread.currentThread().getName() + "Readling " + line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
