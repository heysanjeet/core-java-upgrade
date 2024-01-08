package com.heysanjeet.datastructure.hashtable;

public class HashTableClient {
    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();
        myHashTable.set("Sanjeet", 10);
        myHashTable.set("Sunil", 20);
        myHashTable.set("Manish", 30);
        myHashTable.set("Prashant", 40);

//        System.out.println(myHashTable.get("lumber"));
//        myHashTable.printTable();
        System.out.println(myHashTable.keys());
    }
}
