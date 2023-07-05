package com.heysanjeet.interview_questions;

public class InstanceOfClient {
    public static void main(String[] args) {
        if (null instanceof String)

            System.out.println("print 1");

        else if ("" instanceof String)
            System.out.println("print 2");
        else
            System.out.println("print 3");

    }
}
