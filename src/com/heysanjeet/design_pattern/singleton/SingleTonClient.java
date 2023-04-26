package com.heysanjeet.design_pattern.singleton;

public class SingleTonClient {
    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getObject();
        System.out.println(singleTon.hashCode());

        SingleTon singleTon2 = SingleTon.getObject();
        System.out.println(singleTon2.hashCode());
    }
}
