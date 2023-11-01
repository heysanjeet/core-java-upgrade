package com.heysanjeet.datastructure.queue;

public class Queue {
    public Node first;
    public Node last;
    public int length;

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length++;
    }

    public void enQueue(int value) {
        Node newNode = new Node(value);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node dequeue() {
        Node temp = first;
        if (first == null) {
            return null;
        } else {
            first = first.next;
        }
        length--;
        return temp;
    }

    public void print() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
