package com.heysanjeet.collections.concurrent_colection;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.stream.Collectors;

public class SetExamples {
    public static void main(String[] args) {
        Set<Integer> set=new CopyOnWriteArraySet<>();
        for(int i=111;i<120;i++){
            set.add(i);
        }
        set.stream().filter(value->value%2==0).collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}
