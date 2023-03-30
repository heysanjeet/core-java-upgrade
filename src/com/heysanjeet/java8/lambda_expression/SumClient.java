package com.heysanjeet.java8.lambda_expression;

public class SumClient {
    public static void main(String[] args) {
        LambdaExSum sum = (value1, value2) -> value1 + value2;
        System.out.println(sum.getSum(16,15));//
    }
}
