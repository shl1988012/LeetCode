package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
	For example, given n = 3, a solution set is:
	[
	  "((()))",
	  "(()())",
	  "(())()",
	  "()(())",
	  "()()()"
	]
 *
 */
public class LeetCode_22 {
	
	//方法一： 从n=1开始，在‘()’的任何位置添加'()'    时间复杂度：o(N^3);去重，字符串的拼接很耗时间。
/*	public static List<String> generateParenthesis(int n) {
//		 List<String> result = new ArrayList<String>();
//		 if(n < 1) 
//			 return result;
//		 result.add("()");
//		 for(int i = 1; i < n; i++) {
//			 Set<String> set = new HashSet<String>();
//			 for(String s : result ){
//				  for(int j = 0; j < s.length(); j++) {
//					  set.add(s.substring(0, j) + "()" + s.substring(j, s.length())); 
//				  }
//			 }
//			 List<String> temp = new ArrayList<>(set.size());  
//	         temp.addAll(set);  
//	         result = temp; 
//		 }
//		 return result ;
		
		 List<String> result = new ArrayList<String>();
		 if(n < 1) 
			 return result;
		 Set<String> set = new HashSet<String>();
		 set.add("()");
		 for(int i = 1; i < n; i++) {
			 Set<String> temp = new HashSet<String>();
			 for(String s : set ){
				  for(int j = 0; j < s.length(); j++) {
					  temp.add(s.substring(0, j) + "()" + s.substring(j, s.length())); 
				  }
			 }
			 set = temp ;
		 }
		 result.addAll(set);
		 return result ;
    }*/
	
	//方法二： n个左括号，n个右括号，组合出来所有合法的括号组。 确保这个串的从头开始的任何一个子串都必须是左括号数量不小于右括号数量
	public static List<String> generateParenthesis(int n) {
		   List<String> list = new ArrayList<String>();
	        backtrack(list, "", 0, 0, n);
	        return list;
	    }
	    
	
	    public static void backtrack(List<String> list, String str, int open, int close, int max){
	        
	        if(str.length() == max*2){	//n个左括号，n个右括号 ，所以为max*2
	            list.add(str);
	            return;
	        }
	        
	        if(open < max)
	            backtrack(list, str+"(", open+1, close, max);
	        if(close < open)
	            backtrack(list, str+")", open, close+1, max);
	    }
	
	    
	    
	public static void main(String[] args) {
		List<String> list = LeetCode_22.generateParenthesis(4);
		for(String s : list){
			System.out.println(s);
		}
	}
}
