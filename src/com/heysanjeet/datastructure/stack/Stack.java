package com.heysanjeet.datastructure.stack;

public class Stack {
    public Node top;
    public int length;

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        length++;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        length++;
    }

    public Node pop() {
        Node temp = top;
        if (top == null) {
            return null;
        }
        top = top.next;
        length--;
        return temp;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public int size() {
        return length;
    }

    public Node getPeak() {
        return top;
    }

}
