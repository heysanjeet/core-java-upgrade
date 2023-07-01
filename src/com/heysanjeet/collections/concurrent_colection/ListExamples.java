package com.heysanjeet.collections.concurrent_colection;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListExamples {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("Sanjeet");
        list.add("Sunil");
        list.add("Ruchikesh");
        list.add("Manish");
        list.add("Sanjeet");


        Map<String, Long> mapNames = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        mapNames.entrySet().stream().filter(name->name.getKey().startsWith("Sanjeet"))
                .forEach(System.out::println);
    }
}
