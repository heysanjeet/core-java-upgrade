package com.heysanjeet.datastructure.linkedlist.doublyLL;

public class DoublyLL {
    Node head;
    Node tail;
    int length;

    public DoublyLL(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        Node temp = tail;
        if (head == null) {
            return null;
        }
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        Node temp = head;
        if (head == null) {
            return null;
        }
        if (length == 1) {
            head = null;
            tail = null;
        }
        head = head.next;
        head.prev = null;
        temp.next = null;
        length--;
        return temp;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head " + head);
    }

    public void getTail() {
        System.out.println("Tail " + tail);
    }

    public void length() {
        System.out.println("Size " + length);
    }
}
