package com.heysanjeet.java8.lambda_expression;

public class LambdaExp {
    public static void main(String[] args) {
        Algorithms sum = (a, b) -> a + b;
        System.out.println(sum.calculate(5, 10));//15

        Algorithms multiply = (a, b) -> a * b;
        System.out.println(multiply.calculate(5, 10));//50
    }
}
