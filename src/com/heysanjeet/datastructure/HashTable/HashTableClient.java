package com.heysanjeet.datastructure.HashTable;

public class HashTableClient {
    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();
        myHashTable.set("Sanjeet", 10);
        myHashTable.set("Sunil", 20);
        myHashTable.set("Manish", 30);
        myHashTable.set("Sanjeet", 40);
        myHashTable.printTable();
    }
}
