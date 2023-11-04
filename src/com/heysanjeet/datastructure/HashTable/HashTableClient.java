package com.heysanjeet.datastructure.HashTable;

public class HashTableClient {
    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();
        myHashTable.set("nails", 10);
        myHashTable.set("tile", 20);
        myHashTable.set("lumber", 30);
        myHashTable.set("lumber", 40);

        System.out.println(myHashTable.get("lumber"));
        myHashTable.printTable();
    }
}
