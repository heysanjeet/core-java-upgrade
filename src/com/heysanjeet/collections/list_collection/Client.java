package com.heysanjeet.collections.list_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {

        List<String> namesList = new ArrayList<>();
        namesList.add("Sanjeet");
        namesList.add("Sunil");
        namesList.add("Manish");
        namesList.add("Shivam");
        namesList.add("Sanjeet");

        //namesList.forEach(names -> System.out.println(names));
        Set<String> setName = namesList.stream().filter(names -> names.startsWith("S")).collect(Collectors.toSet());
        setName.stream().forEach(name -> System.out.println(name));
    }
}
