package com.heysanjeet.java8.optional;

import java.util.Optional;
public class OptionalInterviewQ {
    public static void main(String[] args) {
        String[] str = new String[10];
        str[5] = "JAVA OPTIONAL CLASS EXAMPLE";// Setting value for 5th index
        // code solutions below for optional
        Optional<String> checkNull = Optional.of(str[5]);
        if (checkNull.isPresent()) {  // It Checks, value is present or not
            String lowercaseString = str[5].toLowerCase();
            System.out.print(lowercaseString);
        } else
            System.out.println("String value is not present");
    }
}
