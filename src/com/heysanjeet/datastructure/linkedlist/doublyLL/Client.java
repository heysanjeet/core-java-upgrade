package com.heysanjeet.datastructure.linkedlist.doublyLL;

public class Client {
    public static void main(String[] args) {
        DoublyLL doublyLL = new DoublyLL(10);
        doublyLL.append(20);
        doublyLL.insert(1,30);
        doublyLL.remove(1);

        //System.out.println("Removed last value " + doublyLL.removeLast().value);
        doublyLL.print();
        doublyLL.getHead();
        doublyLL.getTail();

    }
}
