package com.learning.dsa.nonlinear.binarytrees;

import java.util.ArrayList;
import java.util.List;

public class TestTree {
  private Node root;

  private static boolean isLeafNode(Node root) {
    return root.left == null && root.right == null;
  }

  @Override
  public String toString() {
    return "TestTree{" + "root=" + root + '}';
  }

  public void insert(int value) {
    Node node = new Node(value);
    if (root == null) {
      root = node;
      return;
    }
    Node curr = root;
    while (true) {
      if (curr.value > value) {
        if (curr.left == null) {
          curr.left = node;
          return;
        }
        curr = curr.left;
      } else {
        if (curr.right == null) {
          curr.right = node;
          return;
        }
        curr = curr.right;
      }
    }
  }

  public boolean find(int value) {
    if (root == null) {
      return false;
    }

    Node curr = root;
    while (curr != null) {
      if (curr.value == value) {
        return true;
      } else if (value < curr.value) {
        curr = curr.left;
      } else {
        curr = curr.right;
      }
    }
    return false;
  }

  public int height() {
    return height(this.root);
  }

  private int height(Node root) {
    if (root == null) {
      return -1;
    }
    if (isLeafNode(root)) {
      return 0;
    }
    return 1 + Math.max(height(root.left), height(root.right));
  }

  public int min() {
    return min(this.root);
  }

  /** Time Complexity: O(n), PostOrder Traversal Logic to write to get min node. */
  private int min(Node root) {
    if (root == null) {
      return Integer.MAX_VALUE;
    }
    if (isLeafNode(root)) {
      return root.value;
    }

    int leftMin = min(root.left);
    int rightMin = min(root.right);
    return Math.min(Math.min(root.value, leftMin), rightMin);
  }

  /** Time Complexity:O(log n) */
  public int minBST(Node root) {
    if (root == null) {
      throw new IllegalStateException("Root is null");
    }
    Node curr = root;
    while (curr != null && curr.left != null) {
      curr = curr.left;
    }
    return curr.value;
  }

  public boolean equals(TestTree other) {
    if (other == null) {
      return false;
    }
    return equals(root, other.root);
  }

  private boolean equals(Node first, Node second) {
    if (first == null && second == null) {
      return true;
    }

    if (first != null && second != null) {
      return first.value == second.value
          && equals(first.left, second.left)
          && equals(first.right, second.right);
    }

    return false;
  }

  public boolean isBST() {
    return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  private boolean isBST(Node root, int min, int max) {
    if (root == null) {
      return true;
    }

    if (root.value < min || root.value > max) {
      return false;
    }

    return isBST(root.left, min, root.value - 1) && isBST(root.right, root.value + 1, max);
  }

  public List<Integer> getNodesAtDistance(int distance){
    List<Integer> list=new ArrayList<>();
    getNodesAtDistance(list,distance,root);
    return list;
  }

  private void getNodesAtDistance(List<Integer> list,int distance,Node root){
    if(root==null){
      return;
    }
    if(distance==0){
      list.add(root.value);
      return;
    }
    getNodesAtDistance(list,distance-1,root.left);
    getNodesAtDistance(list,distance-1,root.right);
  }


  // We can print level order nodes by using BFS
  public  void levelOrderTraversal(){
    int height=height();
    for(int i=0;i<=height;i++){
      System.out.println(getNodesAtDistance(i));
    }
  }


  private class Node {
    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return "Node{" + "value=" + value + ", left=" + left + ", right=" + right + '}';
    }
  }
}
