package com.learning.dsa.linear.stack;

public class StackApp {

  public static void main(String[] args) {
    //		StringReverser stringReverser=new StringReverser();
    //		String  reverse= stringReverser.reverse("abcd");
    //		System.out.println(reverse);
    //
    //		String s=")1+2(";
    //		Expression exp=new Expression(s);
    //		System.out.println(exp.isBalanced());

    Stack stack = new Stack(5);
    stack.push(10);
    stack.push(20);
    stack.push(30);
    System.out.println(stack);
    System.out.println(stack.pop());
    System.out.println(stack.peek());
    System.out.println(stack);
  }
}
