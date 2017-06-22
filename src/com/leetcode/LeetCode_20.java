package com.leetcode;

import java.util.Stack;

//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

//The brackets括号  must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
//灵活运用栈，通过入栈出栈来实现
public class LeetCode_20 {
	
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		char cs[]= s.toCharArray();
		for(char c : cs){
			switch(c){
				case '(' :
					stack.push(')');
					break;
				case '{' :
					stack.push('}');
					break;
				case '[':
					stack.push(']');
					break;
				default:
                    if (stack.isEmpty() || stack.pop() != c){
                        return false;
                    }
                    break;	
			}
		}
		 return stack.isEmpty();
    }
	
//	
//	public static void main(String[] args) {
//		
//		String s = "([)]" ;
//		System.out.println(LeetCode_20.isValid(s));
//	}
}
