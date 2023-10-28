package com.heysanjeet.datastructure.linkedlist.singlyLL;

public class Client {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(10);
        linkedList.append(20);
        linkedList.prepend(50);
//        System.out.println("Removed value "+linkedList.remove().data);
        linkedList.printList();
//        linkedList.getHead();
//        linkedList.getTail();
//        linkedList.length();
    }
}
