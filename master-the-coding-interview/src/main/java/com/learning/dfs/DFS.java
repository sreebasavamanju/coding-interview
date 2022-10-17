package com.learning.dfs;

import com.learning.trees.binarytree.Node;
import com.learning.trees.binarytree.TreeBuilder;

public class DFS {

  public static void main(String[] args) {
    String s = "5 4 3 x x 8 x x 6 x x";
    Node<Integer> root = TreeBuilder.builtBinaryTree(s);
    // BTreePrinter.printNode(root);
    Node dfs = dfs(root, 8);

    if (dfs != null) {
      System.out.println(dfs.value);
    } else {
      System.out.println("ELement Not Found");
    }
  }

  public static Node dfs(Node<Integer> root, int target) {
    if (root == null) {
      return null;
    }
    if (root.value == target) {
      return root;
    }
    Node left = dfs(root.left, target);
    if (left != null) {
      return left;
    }
    return dfs(root.right, target);
  }
}
