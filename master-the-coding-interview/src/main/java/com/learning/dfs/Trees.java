package com.learning.dfs;

import com.learning.trees.binarytree.BTreePrinter;
import com.learning.trees.binarytree.Node;
import com.learning.trees.binarytree.TreeBuilder;

public class Trees {

	public static void main(String[] args) {
		String s = "5 4 3 x x 8 x x 6 x x";
		Node<Integer> root = TreeBuilder.builtBinaryTree(s);
		BTreePrinter.printNode(root);
		System.out.println("Tree Traversal Algorithms");
		System.out.println("In Order Traversal Algorithm");
		inOrderTraversal(root);
		System.out.println();
		System.out.println("Pre Order Traversal Algorithm");
		preOrderTraversal(root);
		System.out.println();
		System.out.println("Post Order Traversal Algorithm");
		postOrderTraversal(root);

	}

	private static void postOrderTraversal(Node<Integer> root) {
		if (root != null) {
			inOrderTraversal(root.left);
			inOrderTraversal(root.right);
			System.out.print(root.value+" ");
		}
	}

	private static void preOrderTraversal(Node<Integer> root) {
		if (root != null) {
			System.out.print(root.value+" ");
			inOrderTraversal(root.left);
			inOrderTraversal(root.right);
		}
	}

	private static void inOrderTraversal(Node<Integer> root) {
		if (root != null) {
			inOrderTraversal(root.left);
			System.out.print(root.value+" ");
			inOrderTraversal(root.right);
		}
	}

}
