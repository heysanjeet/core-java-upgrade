package com.heysanjeet.datastructure.heap;

public class HeapClient {
    public static void main(String[] args) {

        Heap heap = new Heap();
        heap.insert(99);
        heap.insert(61);
        heap.insert(58);
        heap.insert(72);
        heap.insert(100);

        System.out.println(heap.getHeap());

    }
}
