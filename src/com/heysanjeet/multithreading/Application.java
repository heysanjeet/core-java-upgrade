package com.heysanjeet.multithreading;

import com.heysanjeet.multithreading.runnable.FileThread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
//        FileThread fileThread = new FileThread();//new stage
//        fileThread.start();//Ruunnable stage
        //execute run//running
        //job completed -Terminated/DEAD
//
//        FileThread fileThread2 = new FileThread();
//        fileThread2.start();
//
//        FileThread fileThread3 = new FileThread();
//        fileThread3.start();

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
        Thread thread=new Thread(runnable);
        thread.start();
        Thread thread2=new Thread(runnable);
        thread2.start();
        Thread thread3=new Thread(runnable);
        thread3.start();
    }

}
