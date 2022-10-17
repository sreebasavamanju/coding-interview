package com.learning.dfs;

import com.learning.trees.binarytree.BTreePrinter;
import com.learning.trees.binarytree.Node;
import com.learning.trees.binarytree.TreeBuilder;

/**
 * A balanced binary tree is defined as a tree such that either it is an empty tree, or all its
 * subtree are balanced and has a height difference of at most 1.
 *
 * <p>In that case, given a binary tree, determine if it's balanced.
 */
public class BalancedBinaryTree {

  public static void main(String[] args) {
    String s = "1 2 3 x x 4 x 6 x x 5 x x";
    Node<Integer> root = TreeBuilder.builtBinaryTree(s);
    BTreePrinter.printNode(root);
    boolean result = isBalanced(root);
    System.out.println(result);
  }

  private static boolean isBalanced(Node<Integer> root) {
    return maxHeight(root) != -1;
  }

  private static int maxHeight(Node<Integer> root) {

    if (root == null) {
      return 0;
    }
    int left = maxHeight(root.left);
    int right = maxHeight(root.right);
    if (left == -1 || right == -1) {
      return -1;
    }
    if (Math.abs(left - right) > 1) {
      return -1;
    }
    return Math.max(left, right) + 1;
  }
}
