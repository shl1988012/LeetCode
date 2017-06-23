package com.leetcode;

/*38. Count and Say*/

/**
 * The count-and-say sequence is the sequence of integers with the first five terms as following:

1.     1
2.     11
3.     21
4.     1211
5.     111221
1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth term of the count-and-say sequence.
 *
 */

//看着像是一个递归 已知f(1) = 1, f(2)= 11, 求f(n)
public class LeetCode_38 {
	
	public  String countAndSay(int n) {
        if(n <1){
        	return "" ;
        }
        String s = "1";
        for(int i = 1 ; i< n ; i ++){
        	s = countNumbers(s);
        }
        return s ;
	}

	private  String countNumbers(String s) {
		//对f(2)需要单独处理
		 if(s.length() == 1) {  
	            return 1 + s;  
	     } 
		StringBuilder sb = new StringBuilder();
		int count = 1 ;
		char cur = s.charAt(0);
		for(int i =1 ; i<s.length() ; i++){
			if(s.charAt(i)== cur){
				count++ ;
			}else{
				sb.append(count + "" + cur);
				count =1 ;
				cur = s.charAt(i);
			}
		}
		 sb.append(count + "" + cur);
		return sb.toString();
	}
	
//	public static void main(String[] args) {
//		System.out.println( countAndSay(3));
//	}
	
}















