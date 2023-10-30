package com.heysanjeet.datastructure.linkedlist.singlyLL;

public class Client {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(0);
        linkedList.append(2);

        linkedList.insert(1,30);
        linkedList.remove(1);
        linkedList.reverse();
        linkedList.printList();

        System.out.println("--------------------------");
        //System.out.println(linkedList.get(3).data);//30
        //System.out.println("Removed First "+linkedList.removeFirst().data);
//        System.out.println("Removed value "+linkedList.remove().data);
        //linkedList.printList();
//        linkedList.getHead();
//        linkedList.getTail();
//        linkedList.length();
    }
}
