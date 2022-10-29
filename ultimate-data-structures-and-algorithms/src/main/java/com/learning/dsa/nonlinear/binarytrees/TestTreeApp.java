package com.learning.dsa.nonlinear.binarytrees;

import java.util.List;

public class TestTreeApp {
  public static void main(String[] args) {
    TestTree tree=new TestTree();
    tree.insert(7);
    tree.insert(4);
    tree.insert(9);
    tree.insert(1);
    tree.insert(6);
    tree.insert(8);
    tree.insert(10);
    System.out.println(tree.find(10));
    System.out.println(tree.height());
    System.out.println(tree.min());

    List<Integer> nodesAtDistance = tree.getNodesAtDistance(5);
    System.out.println(nodesAtDistance);

    tree.levelOrderTraversal();
  }
}
