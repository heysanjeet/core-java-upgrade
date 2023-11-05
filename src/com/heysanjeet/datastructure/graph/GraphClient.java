package com.heysanjeet.datastructure.graph;

public class GraphClient {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        //add adge
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("A", "D");
        graph.addEdge("B", "D");
        graph.addEdge("C", "D");
        graph.printGraph();

        System.out.println("------------------------------");
        graph.removeVertex("D");
        graph.printGraph();
    }
}
