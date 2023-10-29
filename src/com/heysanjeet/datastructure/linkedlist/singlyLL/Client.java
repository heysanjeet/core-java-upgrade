package com.heysanjeet.datastructure.linkedlist.singlyLL;

public class Client {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(10);
        linkedList.append(20);
        linkedList.append(50);
        linkedList.set(3,30);
        linkedList.printList();
        System.out.println("--------------------------");
        System.out.println(linkedList.get(3).data);//50
        //System.out.println("Removed First "+linkedList.removeFirst().data);
//        System.out.println("Removed value "+linkedList.remove().data);
        //linkedList.printList();
//        linkedList.getHead();
//        linkedList.getTail();
//        linkedList.length();
    }
}
