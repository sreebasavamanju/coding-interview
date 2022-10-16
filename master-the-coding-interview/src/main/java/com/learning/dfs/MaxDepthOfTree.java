package com.learning.dfs;

import com.learning.trees.binarytree.BTreePrinter;
import com.learning.trees.binarytree.Node;
import com.learning.trees.binarytree.TreeBuilder;

/**
 * 
 * Max depth of a binary tree is the longest root-to-leaf path. Given a binary
 * tree, find its max depth.
 *
 */
public class MaxDepthOfTree {

	public static void main(String[] args) {
		String s = "5 4 3 x x 8 x x 6 x x";
		Node<Integer> root = TreeBuilder.builtBinaryTree(s);
		BTreePrinter.printNode(root);
		int maxDepth = maxDepth(root);
		System.out.println(maxDepth);
	}

	private static int maxDepth(Node root) {
		return root != null ? dfs(root) - 1 : 0;
	}

	private static int dfs(Node root) {
		if (root == null) {
			return 0;
		}
		int leftCount = dfs(root.left);
		int rightCount = dfs(root.right);
		return Math.max(leftCount, rightCount) + 1;
	}
}
