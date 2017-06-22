package com.leetcode;


/*Determine whether an integer is a palindrome. Do this without extra space.

Some hints:
Could negative integers be palindromes? (ie, -1)
If you are thinking of converting the integer to string, note the restriction of using extra space.
You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", 
you know that the reversed integer might overflow. How would you handle such case?
There is a more generic way of solving this problem.
*/
public class LeetCode_9 {
	//方法一  给力
	public boolean isPalindrome(int x) {
		if(x<0) return false ;
		
		int p = x; 
	    int q = 0; 
	    
	    while (p >= 10){
	        q *=10; 
	        q += p%10; 
	        p /=10; 
	    }
	    
	    return q == x / 10 ;
	}
	
	//方法二
	/* public boolean isPalindrome(int x) {
	        if (x >= 0 && x < 10) {
	            return true;
	        }
	        if (x < 0) {
	            return false;
	        }
	        //这层判断还是必须的，貌似是通过Leetcode的测试样例来添加的
	        if (x % 10 == 0) {
	            return false;
	        }
	        int r = 0;
	        while(r < x) {
	            int e = x % 10;
	            x = x / 10;
	            if (r == x) {
	                return true;
	            }
	            r = r * 10;
	            r = r + e;
	        }
	        return (r == x);
	    }*/
	 
	 
	 public static void main(String[] args) {
		 LeetCode_9 l9 = new LeetCode_9();
		 
		 System.out.println(l9.isPalindrome(100));
	}
	 
}
