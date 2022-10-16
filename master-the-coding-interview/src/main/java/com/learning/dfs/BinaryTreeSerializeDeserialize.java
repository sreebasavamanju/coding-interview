package com.learning.dfs;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.StringJoiner;

import com.learning.trees.binarytree.BTreePrinter;
import com.learning.trees.binarytree.Node;
import com.learning.trees.binarytree.TreeBuilder;

/**
 * 
 * Given a binary tree, write a serialize function that converts the tree into a
 * string and a deserialize function that converts a string to a binary tree.
 * You may serialize the tree into any string representation you want as long as
 * it can be deseralized.
 *
 */
public class BinaryTreeSerializeDeserialize {

	public static void main(String[] args) {
		String s = "1 2 3 x x 4 x 6 x x 5 x x";
		Node<Integer> root = TreeBuilder.builtBinaryTree(s);
		BTreePrinter.printNode(root);
		Node deserialize = deserialize(s);
		System.out.println("After Deserialize");
		BTreePrinter.printNode(root);
		System.out.println("After Serialize");
		String serialize = serialize(root);
		System.out.println(serialize);
	}

	public static String serialize(Node root) {
		StringJoiner joiner=new StringJoiner(" ");
		if(root==null) {
			return null;
		}
		serializeDFS(root,joiner);
		return joiner.toString();
	}

	private static void serializeDFS(Node root, StringJoiner joiner) {
		if(root==null) {
			joiner.add("x");
			return;
		}
		joiner.add(root.value.toString());
		serializeDFS(root.left, joiner);
		serializeDFS(root.right, joiner);
	}

	public static Node deserialize(String root) {
		if(root==null) {
			return null;
		}
		List<String> list=Arrays.asList(root.split(" "));
		return deserializeDFS(list.iterator());
	}

	private static Node deserializeDFS(Iterator<String> iterator) {
		String next = iterator.next();
		if(next.equals("x")) {
			return null;
		}
		Node curr=new Node<Integer>(Integer.parseInt(next));
		curr.left=deserializeDFS(iterator);
		curr.right=deserializeDFS(iterator);
		return curr;
	}
}
