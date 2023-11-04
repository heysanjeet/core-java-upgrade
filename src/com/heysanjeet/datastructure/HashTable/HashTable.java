package com.heysanjeet.datastructure.HashTable;

public class HashTable {
    private int size = 7;
    private Node[] dataMap;

    public HashTable() {
        dataMap = new Node[size];
    }

    public void set(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    private int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for (int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i];
            //multiply with any prime no like 23.the no you will get is more random
            //if % dataMap.length you will get the index value within the range.
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }

    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println("-------i------ " + i);
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println("Key " + temp.key + " value " + temp.value);
                temp = temp.next;
            }

        }
    }
}
