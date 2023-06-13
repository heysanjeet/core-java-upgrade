package com.heysanjeet.java8.optional;

import java.util.Optional;

public class OptionalExamples {
    public static void main(String[] args) {
        //isPresentEx();
        orElseEx();
    }

    public static void orElseEx() {
        String nullNmae = "Sunil";
        String name = Optional.ofNullable(nullNmae).orElse("Sanjeet");
        System.out.println(name);
    }

    public static void isPresentEx() {
        Optional<String> opt = Optional.of("Sanjeet");
        if (opt.isPresent()) {
            System.out.println("Name is present.");
        } else {
            System.out.println("Name is not present.");
        }
    }
}
