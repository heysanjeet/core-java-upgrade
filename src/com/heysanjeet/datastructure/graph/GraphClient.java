package com.heysanjeet.datastructure.graph;

public class GraphClient {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        //add adge
       graph.addEdge("A", "B");
        graph.printGraph();
    }
}
