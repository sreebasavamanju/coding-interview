package com.learning.dsa.nonlinear.binarytrees;

import java.util.List;

public class TreeApp {
  public static void main(String[] args) {
    Tree tree = new Tree();
    tree.insert(20);
    tree.insert(10);
    tree.insert(30);
    tree.insert(6);
    tree.insert(14);
    tree.insert(3);
    tree.insert(8);
    tree.insert(24);
    tree.insert(26);
    System.out.println(tree);
    System.out.println(tree.find(8));
    System.out.println(tree.find(15));
    System.out.println("In Order Traversal / Ascending Oder ");
    tree.traverseInOrder();
    System.out.println();
    System.out.println("Pre Order Traversal");
    tree.traversePreOrder();
    System.out.println();
    System.out.println("Post Order Traversal");
    tree.traversePostOrder();
    System.out.println();
    System.out.println("Descending Order ");
    tree.printDescendingOrder();
    System.out.println();
    System.out.println("Level Order Traversal");
    tree.traverseLevelOrder();
    System.out.println();
    System.out.println("Height Of Tree: "+tree.height());
    System.out.println("Min Element of the Binary Tree is: "+tree.findMin());
    System.out.println("Min Element of the Binary Search Tree is: "+tree.min());
    System.out.println("Max Element of the Binary Search Tree is: "+tree.max());


    Tree firstTree=new Tree();
    firstTree.insert(7);
    firstTree.insert(4);
    firstTree.insert(9);
    firstTree.insert(1);
    firstTree.insert(6);
    firstTree.insert(8);
    firstTree.insert(10);

    Tree secondTree=new Tree();
    secondTree.insert(7);
    secondTree.insert(4);
    secondTree.insert(9);
    secondTree.insert(1);
    secondTree.insert(6);
    secondTree.insert(8);
    secondTree.insert(10);

    System.out.println("Is Both are Equal: " +firstTree.isEqualsTo(secondTree));
    //secondTree.swapRoot();
    System.out.println("is BST tree: "+secondTree.iSBST());
    List<Integer> nodesAtDistance = secondTree.getNodesAtDistance(2);
    System.out.println(nodesAtDistance);
  }
}
