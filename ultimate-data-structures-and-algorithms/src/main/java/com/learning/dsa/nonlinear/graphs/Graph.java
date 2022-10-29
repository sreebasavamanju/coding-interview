package com.learning.dsa.nonlinear.graphs;

import java.util.*;

/** Graph Implemented via Adjacency List with Directed. */
public class Graph {
  private Map<String, Node> nodes = new HashMap<>();
  private Map<Node, List<Node>> adjacencyList = new HashMap<>();

  public void addNode(String label) {
    Node node = new Node(label);
    nodes.putIfAbsent(label, node);
    adjacencyList.putIfAbsent(node, new ArrayList<>());
  }

  public void addEdge(String from, String to) {
    Node fromNode = nodes.get(from);
    if (fromNode == null) {
      throw new IllegalArgumentException();
    }
    Node toNode = nodes.get(to);
    if (toNode == null) {
      throw new IllegalArgumentException();
    }
    adjacencyList.get(fromNode).add(toNode);
  }

  public void removeNode(String label) {
    Node node = nodes.get(label);
    if (node == null) {
      return;
    }
    for (Node currNode : adjacencyList.keySet()) {
      adjacencyList.get(currNode).remove(node);
    }
    adjacencyList.remove(node);
    nodes.remove(node);
  }

  public void removeEdge(String from, String to) {
    Node fromNode = nodes.get(from);
    Node toNode = nodes.get(to);
    if (fromNode == null || toNode == null) {
      return;
    }

    adjacencyList.get(fromNode).remove(toNode);
  }

  public void print() {
    for (Node source : adjacencyList.keySet()) {
      List<Node> targets = adjacencyList.get(source);
      if (!targets.isEmpty()) {
        System.out.println(source + " is connected to " + targets);
      }
    }
  }

  public void traverseDFS(String root) {
    Node node = nodes.get(root);
    if (node == null) {
      return;
    }
    traverseDFS(node, new HashSet<>());
  }

  private void traverseDFS(Node root, Set<Node> visited) {

    System.out.println(root);
    visited.add(root);
    for (Node node : adjacencyList.get(root)) {
      if (!visited.contains(node)) {
        traverseDFS(node, visited);
      }
    }
  }

  public void traverseDFSIterative(String root) {
    Node node = nodes.get(root);
    if (root == null) {
      return;
    }
    Set<Node> visited = new HashSet<>();
    Stack<Node> stack = new Stack<>();
    stack.push(node);

    while (!stack.isEmpty()) {
      Node curr = stack.pop();
      if (!visited.contains(curr)) {
        System.out.println(curr);
        visited.add(curr);
        for (Node adjNode : adjacencyList.get(root)) {
          if (!visited.contains(adjNode)) {
            stack.push(adjNode);
          }
        }
      }
    }
  }

  public void traverseBFS(String root) {
    Node node = nodes.get(root);
    if (node == null) {
      return;
    }
    Set<Node> visited = new HashSet<>();
    Queue<Node> queue = new ArrayDeque<>();
    queue.add(node);
    while (!queue.isEmpty()) {
      Node remove = queue.remove();
      if (!visited.contains(remove)) {
        System.out.println(remove);
        visited.add(remove);
        for (Node neighbour : adjacencyList.get(remove)) {
          if (!visited.contains(neighbour)) {
            queue.add(neighbour);
          }
        }
      }
    }
  }

  public List<String> topologicalSort() {
    Set<Node> visited = new HashSet<>();
    Stack<Node> stack = new Stack<>();
    for (Node node : nodes.values()) {
      topologicalSort(node, visited, stack);
    }
    List<String> sorted = new ArrayList<>();
    while (!stack.isEmpty()) {
      sorted.add(stack.pop().label);
    }
    return sorted;
  }

  private void topologicalSort(Node node, Set<Node> visited, Stack<Node> stack) {
    if (visited.contains(node)) {
      return;
    }
    visited.add(node);
    for (Node neighbour : adjacencyList.get(node)) {
      topologicalSort(neighbour, visited, stack);
    }
    stack.push(node);
  }

  public boolean hasCycle(){
    Set<Node> all =new HashSet<>();
    all.addAll(nodes.values());
    Set<Node> visiting =new HashSet<>();
    Set<Node> visited =new HashSet<>();

    while(!all.isEmpty()){

    }
    return false;
  }

  private class Node {
    private String label;

    public Node(String label) {
      this.label = label;
    }

    @Override
    public String toString() {
      return label;
    }
  }
}
