package com.heysanjeet.datastructure.linkedlist.singlyLL;


public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head : " + head.data);
    }

    public void getTail() {
        System.out.println("Tail : " + tail.data);
    }

    public void length() {
        System.out.println(length);
    }
}
