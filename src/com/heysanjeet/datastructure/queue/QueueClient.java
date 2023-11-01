package com.heysanjeet.datastructure.queue;

public class QueueClient {
    public static void main(String[] args) {
        Queue queue = new Queue(10);
        queue.enQueue(50);
        queue.enQueue(40);
        queue.enQueue(30);
        queue.dequeue();
        queue.print();
    }
}
