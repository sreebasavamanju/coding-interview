package com.learning.dsa.nonlinear.binarytrees;

import java.util.ArrayList;
import java.util.List;

public class Tree {
  private Node root;

  public Tree(Node root) {
    this.root = root;
  }

  public Tree() {}

  @Override
  public String toString() {
    return "Tree{" + "root=" + root + '}';
  }

  public boolean findUsingRecursive(int value) {
    Node node = search(value, this.root);
    return node != null;
  }

  public boolean find(int value) {
    Node current = root;
    while (current != null) {
      if (current.value > value) {
        current = current.left;
      } else if (current.value < value) {
        current = current.right;
      } else {
        return true;
      }
    }
    return false;
  }

  public void insert(int value) {
    Node newNode = new Node(value);
    if (root == null) {
      root = newNode;
      return;
    }

    Node current = root;
    while (true) {
      if (value < current.value) {
        if (current.left == null) {
          current.left = newNode;
          return;
        }
        current = current.left;
      } else {
        if (current.right == null) {
          current.right = newNode;
          return;
        }
        current = current.right;
      }
    }
  }

  private Node search(int value, Node root) {
    if (root == null) {
      return null;
    }
    if (root.value == value) {
      return root;
    }
    if (root.value > value) {
      return search(value, root.left);
    } else if (root.value < value) {
      return search(value, root.right);
    }
    return null;
  }

  public void traversePreOrder() {
    this.preOrderTraversal(this.root);
  }

  public void traversePostOrder() {
    this.postOrderTraversal(this.root);
  }

  public void traverseInOrder() {
    this.inOrderTraversal(this.root);
  }

  /** All inOrder,preOrder,postOrder traversal are all DFS. */
  private void inOrderTraversal(Node root) {
    if (root == null) {
      return;
    }
    inOrderTraversal(root.left);
    System.out.print(root.value + " ");
    inOrderTraversal(root.right);
  }

  private void preOrderTraversal(Node root) {
    if (root == null) {
      return;
    }
    System.out.print(root.value + " ");
    preOrderTraversal(root.left);
    preOrderTraversal(root.right);
  }

  private void postOrderTraversal(Node root) {
    if (root == null) {
      return;
    }
    postOrderTraversal(root.left);
    postOrderTraversal(root.right);
    System.out.print(root.value + " ");
  }

  public void printDescendingOrder() {
    this.printElementsInReverse(this.root);
  }

  private void printElementsInReverse(Node root) {
    // similar ro  in-order traversal but order will be changed.
    if (root == null) {
      return;
    }
    printElementsInReverse(root.right);
    System.out.print(root.value + " ");
    printElementsInReverse(root.left);
  }

  private int height(Node root) {

    if (root == null) {
      return -1;
    }
    if (isLeaf(root)) {
      return 0;
    }
    return 1 + Math.max(height(root.left), height(root.right));
  }

  public int height() {
    return this.height(this.root);
  }

  /** Find min value in Binary Tree impl. O(n) - Time Complexity. */
  public int findMin() {
    return this.findMin(this.root);
  }

  /** Min Element in Binary Search Tree. */
  public int min() {
    Node current = this.root;

    if (current == null) {
      throw new IllegalStateException();
    }
    while (current != null && current.left != null) {
      current = current.left;
    }
    return current.value;
  }

  /** Max Element in Binary Search Tree */
  public int max() {
    if (root == null) {
      throw new IllegalStateException();
    }
    Node current = root;
    while (current != null && current.right != null) {
      current = current.right;
    }
    return current.value;
  }

  // Find Min in Binary Tree.
  private int findMin(Node root) {
    if (isLeaf(root)) {
      return root.value;
    }
    int leftMin = findMin(root.left);
    int rightMin = findMin(root.right);
    return Math.min(Math.min(root.value, leftMin), rightMin);
  }

  public boolean isEqualsTo(Tree other) {
    if (other == null) {
      return false;
    }
    return isEqualsTo(root, other.root);
  }

  private boolean isEqualsTo(Node first, Node second) {
    if (first == null && second == null) {
      return true;
    }
    if (first != null && second != null) {
      return first.value == second.value
          && isEqualsTo(first.left, second.left)
          && isEqualsTo(first.right, second.right);
    }
    return false;
  }

  public boolean iSBST() {
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

  public void swapRoot() {
    Node temp = root.left;
    root.left = root.right;
    root.right = temp;
  }

  public List<Integer> getNodesAtDistance(int distance) {
    List<Integer> list = new ArrayList<>();
    getNodesAtDistance(root, distance, list);
    return list;
  }

  private void getNodesAtDistance(Node root, int distance, List<Integer> list) {
    if (root == null) {
      return;
    }
    if (distance == 0) {
      // System.out.println(root.value);
      list.add(root.value);
      return;
    }
    getNodesAtDistance(root.left, distance - 1, list);
    getNodesAtDistance(root.right, distance - 1, list);
  }

  /** BFS traversal. */
  public void traverseLevelOrder() {
    int height = height();
    for (int i = 0; i <= height; i++) {
      List<Integer> nodesAtDistance = getNodesAtDistance(i);
      System.out.println(nodesAtDistance);
    }
  }

  private boolean isLeaf(Node node) {
    return node.left == null && node.right == null;
  }

  public int size() {
    return size(this.root);
  }

  private int size(Node root) {
    if (root == null) {
      return 0;
    }
    if (isLeaf(root)) {
      return 1;
    }
    return 1 + size(root.left) + size(root.right);
  }

  public int countLeafs() {
    return countLeafs(root);
  }

  private int countLeafs(Node root) {
    if (root == null) {
      return 0;
    }

    if (isLeaf(root)) {
      return 1;
    }
    return countLeafs(root.left) + countLeafs(root.right);
  }

  public int maxRecursive() {
    if (root == null) {
      throw new IllegalStateException();
    }
    return max(root);
  }

  private int max(Node root) {
    if (root.right == null) {
      return root.value;
    }
    return max(root.right);
  }

  public boolean contains(int value) {
    return contains(root, value);
  }

  private boolean contains(Node root, int value) {
    if (root == null) {
      return false;
    }
    if (root.value == value) {
      return true;
    }
    return contains(root.left, value) || contains(root.right, value);
  }

  public boolean areSiblings(int first, int second) {
    return areSiblings(root, first, second);
  }

  private boolean areSiblings(Node root, int first, int second) {
    if (root == null) {
      return false;
    }
    boolean areSiblings = false;
    if (root.left != null && root.right != null) {
      areSiblings =
          (root.left.value == first && root.right.value == second)
              || (root.left.value == second && root.right.value == first);
    }
    return areSiblings
        || areSiblings(root.left, first, second)
        || areSiblings(root.right, first, second);
  }

  public List<Integer> getAncestors(int value) {
    List<Integer> list = new ArrayList<>();
    getAncestors(root, value, list);
    return list;
  }

  private boolean getAncestors(Node root, int value, List<Integer> list) {
    if (root == null) {
      return false;
    }
    if (root.value == value) {
      return true;
    }
    if (getAncestors(root.left, value, list) || getAncestors(root.right, value, list)) {
      list.add(root.value);
      return true;
    }
    return false;
  }

  public boolean isBalanced() {
    return isBalanced(root);
  }

  private boolean isBalanced(Node root) {
    if (root == null) {
      return false;
    }
    int balanceFactor = height(root.left) - height(root.right);

    return Math.abs(balanceFactor) <= 1 && isBalanced(root.left) && isBalanced(root.right);
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
