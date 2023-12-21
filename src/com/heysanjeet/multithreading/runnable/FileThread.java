package com.heysanjeet.multithreading.runnable;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileThread extends Thread{
    @Override
    public void run() {
      try(BufferedReader reader=new BufferedReader(new FileReader(new File("C:\\Users\\Sanjeet\\Downloads\\Ex_Files_Java_EE_Concurrency\\Exercise Files\\Chapter2\\02_04\\begin\\javaseconcurrency\\sample.txt")))){
          String line=null;
          while ((line=reader.readLine()) !=null){
              System.out.println(Thread.currentThread().getName()+" Reading line "+line);
          }
      } catch (IOException e) {
          throw new RuntimeException(e);
      }
    }
}
