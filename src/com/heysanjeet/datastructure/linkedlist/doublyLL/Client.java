package com.heysanjeet.datastructure.linkedlist.doublyLL;

public class Client {
    public static void main(String[] args) {
        DoublyLL doublyLL = new DoublyLL(1);
        doublyLL.append(10);
        doublyLL.prepend(25);
        doublyLL.removeFirst();
        doublyLL.set(0, 20);
        System.out.println(doublyLL.get(1).value);
        System.out.println("--------------------------");
        //System.out.println("Removed last value " + doublyLL.removeLast().value);
        doublyLL.print();
        doublyLL.getHead();
        doublyLL.getTail();

    }
}
