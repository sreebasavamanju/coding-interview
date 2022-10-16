package com.learning.dsa.linear.stack;

import java.util.Stack;

public class StringReverser {

	public String reverse(String input) {
		if(input==null) {
			return null;
		}
		Stack<Character> stack=new Stack<Character>();
		for(Character c:input.toCharArray()) {
			stack.push(c);
		}
		StringBuilder builder=new StringBuilder();
		while(!stack.isEmpty()) {
			builder.append(stack.pop());
		}
		return builder.toString();
	}
}
