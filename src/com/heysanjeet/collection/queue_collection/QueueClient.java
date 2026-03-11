package com.heysanjeet.collection.queue_collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClient {
    static void main() {
        Queue<Integer> queue=new PriorityQueue<>((a,b)->b-a);
        queue.add(40);
        queue.add(10);
        //queue.add(50);
        queue.add(20);
        queue.add(30);

        System.out.println(queue.peek());



        //queue.stream().forEach(System.out::println);
    }
}
