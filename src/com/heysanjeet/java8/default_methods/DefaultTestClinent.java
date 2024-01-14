package com.heysanjeet.java8.default_methods;

public class DefaultTestClinent implements DefaultMethodInSample1, DefaultMethodInSample2 {
    public static void main(String[] args) {
        DefaultTestClinent defaultMethodExClient = new DefaultTestClinent();
        defaultMethodExClient.print();
    }

    @Override
    public void print() {
        System.out.println("Print in client class");
        DefaultMethodInSample2.super.print();
    }
}
