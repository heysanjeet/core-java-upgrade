package com.heysanjeet.java8.default_methods;

public class DefaultMethodExClient implements DefaultMethodExample {
    @Override
    public void sayHello() {
        System.out.println("Hello in impl classes.");
    }

    public static void main(String[] args) {
        DefaultMethodExample sample=new DefaultMethodExClient();
        sample.sayHello();
    }
}
