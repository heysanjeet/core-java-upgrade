package com.heysanjeet.multithreading;

import com.heysanjeet.multithreading.runnable.FileThread;

public class Application {
    public static void main(String[] args) {
        FileThread fileThread = new FileThread();
        fileThread.start();

        FileThread fileThread2 = new FileThread();
        fileThread2.start();

        FileThread fileThread3 = new FileThread();
        fileThread3.start();

    }
}
