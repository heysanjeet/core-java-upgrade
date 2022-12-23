package com.heysanjeet.oops.inheritance;

public class Client {
    public static void main(String[] args) {
        Super su = new Child();
        System.out.println(su.sValue + "" + su.print());

    }
}
