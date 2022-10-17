package com.learning.dfs;

import com.learning.trees.binarytree.BTreePrinter;
import com.learning.trees.binarytree.Node;
import com.learning.trees.binarytree.TreeBuilder;

/**
 * In a binary tree, we define a node "visible" when no node on the root-to-itself path (inclusive)
 * has a greater value. The root is always "visible" since there are no other nodes between the root
 * and itself. Given a binary tree, count the number of "visible" nodes.
 */
public class VisibleTreeNodes {

  public static void main(String[] args) {
    String s = "5 4 3 x x 8 x x 6 x x";
    Node<Integer> root = TreeBuilder.builtBinaryTree(s);
    BTreePrinter.printNode(root);
    int count = countVisibleNodes(root);
    System.out.println(count);
  }

  private static int countVisibleNodes(Node<Integer> root) {
    return root != null ? dfs(root, Integer.MIN_VALUE) : 0;
  }

  private static int dfs(Node<Integer> root, int maxSoFar) {
    if (root == null) {
      return 0;
    }
    int total = 0;
    if (root.value >= maxSoFar) {
      total++;
    }
    total += dfs(root.left, Math.max(maxSoFar, root.value));
    total += dfs(root.right, Math.max(maxSoFar, root.value));
    return total;
  }
}
