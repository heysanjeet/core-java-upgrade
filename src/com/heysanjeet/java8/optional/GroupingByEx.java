package com.heysanjeet.java8.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByEx {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(new Product("Apple", 120.2)
                , new Product("Mango", 50.5), new Product("Apple", 120.2)
                , new Product("Banana", 30.5), new Product("Apple", 120.2)
                , new Product("Grapes", 70.5));
        Map<Double, List<Product>> priceMap = products.stream().collect(Collectors.groupingBy(Product::getProductPrice));
        System.out.println(priceMap);
    }
}
