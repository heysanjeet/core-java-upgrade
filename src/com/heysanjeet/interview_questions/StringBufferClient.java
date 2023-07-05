package com.heysanjeet.interview_questions;

public class StringBufferClient {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = s1;
        System.out.println(s2==s1);//true
        if (s2 == s1) {
            //System.out.println(s1 + s2 + (s1 == s2));//compile time  error
        }
    }
}
