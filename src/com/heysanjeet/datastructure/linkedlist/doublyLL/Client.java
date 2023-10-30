package com.heysanjeet.datastructure.linkedlist.doublyLL;

public class Client {
    public static void main(String[] args) {
        DoublyLL doublyLL = new DoublyLL(1);
        doublyLL.append(10);
        System.out.println("Removed last value " + doublyLL.removeLast().value);
        doublyLL.print();
        doublyLL.getHead();
        doublyLL.getTail();

    }
}
