package com.heysanjeet.collections.interview_questions;

import java.util.ArrayList;
import java.util.List;

public class ListClient {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();

        final List<String> list=new ArrayList<>();// runtime polymorphism
        list.add("Sanjeet");
        list.add("Sunil");
        System.out.println(list);
    }
}
