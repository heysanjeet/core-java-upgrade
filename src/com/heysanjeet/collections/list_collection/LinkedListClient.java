package com.heysanjeet.collections.list_collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListClient {
    public static void main(String[] args) {
        List<String> linkedList=new LinkedList<>();
        linkedList.add("Bangalore");
        linkedList.add("Patna");
        linkedList.add("Pune");
        linkedList.add("Hyderabad");

        linkedList.stream().forEach(city-> System.out.println(city));
    }
}
