package com.heysanjeet.java8.stream;

import java.util.stream.IntStream;

public class ParallelStream {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        IntStream.range(1, 1000000).parallel().forEach(x-> System.out.println(x));
        long end=System.currentTimeMillis();
        System.out.println("Parallel stream time taken "+(end-start));
    }
}
