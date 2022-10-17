package com.learning.trees.binarytree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class TreeBuilder {

  public static Node<Integer> builtBinaryTree(String s) {
    List<String> splitWords = splitWords(s);
    return buildTree(splitWords.iterator(), Integer::parseInt);
  }

  private static <T> Node<T> buildTree(Iterator<String> iter, Function<String, T> f) {
    String val = iter.next();
    if (val.equals("x")) return null;
    Node<T> left = buildTree(iter, f);
    Node<T> right = buildTree(iter, f);
    return new Node<T>(f.apply(val), left, right);
  }

  private static List<String> splitWords(String s) {
    return s.isEmpty() ? new ArrayList<>() : Arrays.asList(s.split(" "));
  }
}
