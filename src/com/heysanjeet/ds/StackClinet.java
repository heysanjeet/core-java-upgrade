package com.heysanjeet.ds;

public class StackClinet {
    public static void main(String[] args) {
        Stack stack=new Stack(5);
        stack.push(45);
        stack.push(65);
        stack.push(76);
        stack.push(94);

        System.out.println(stack.size());//4
        System.out.println(stack.pop());//94
        System.out.println(stack.size());//3
    }
}
