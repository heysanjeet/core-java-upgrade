package com.heysanjeet.datastructure.stack;

public class StackClient {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.size());
        System.out.println("-----------------");
        stack.printStack();
    }
}
