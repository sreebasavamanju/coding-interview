package com.learning.dsa.nonlinear.graphs;

import java.util.List;

public class GraphApp {

  public static void main(String[] args) {
    Graph graph = new Graph();
    graph.addNode("A");
    graph.addNode("B");
    graph.addNode("C");
    graph.addEdge("A", "B");
    graph.addEdge("A","C");
    graph.addEdge("B","C");
    graph.print();
    graph.removeEdge("A","C");
    graph.print();
    graph.removeEdge("A","H");
    graph.print();
    graph.removeNode("A");
    graph.print();

    Graph graph1=new Graph();
    graph1.addNode("X");
    graph1.addNode("A");
    graph1.addNode("B");
    graph1.addNode("P");
    graph1.addEdge("X","A");
    graph1.addEdge("X","B");
    graph1.addEdge("A","P");
    graph1.addEdge("B","P");
    List<String> strings = graph1.topologicalSort();
    System.out.println(strings);
  }
}
