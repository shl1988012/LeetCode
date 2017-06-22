package com.leetcode;

/**
 * 
 * 	Reverse digits of an integer.
	Example1: x = 123, return 321
	Example2: x = -123, return -321
	Note:
The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
 *
 */
public class LeetCode_7 {
	
	//方法一： 我的做法，翻转做的很渣，判断溢出是通过long来和Math.Max_value来判断的 。
/*	 public int reverse(int x) {
		 boolean flag =false ;  //标记是否是负数
		 long l = x;
	     if(x<0){
	    	 flag =false;
	    	  l =Math.abs(l);
	     }else{
	    	 flag =true;
	     }
	     String revStr = new StringBuffer(l+"").reverse().toString();
		 long re =  Long.parseLong(revStr);
		 if(re>Integer.MAX_VALUE){
			 return 0;
		 }
		 if(flag ==false){
			 return (int) (re*(-1)) ;
		 }else {
			 return (int)re;
		 }
	 }*/
	 
	 
	 public int reverse(int x) {
		 int result=0;
		 while(x!=0){
			 int tail =x%10;
			 int newResult = result * 10 + tail;
			 if((newResult-tail)/10 !=result){ //判断溢出：  如果出现溢出，那么逆运算后result和newResult必然不相等，反之，如果没有溢出
				 return 0;
			 }
			 result =newResult ;
			 x=x/10;
		 }
		 return result ;
	 }
	 
	 
	 
	
	public static void main(String[] args) {
		
		LeetCode_7 l7 = new LeetCode_7();
		System.out.println(l7.reverse(Integer.MIN_VALUE));
		System.out.println(l7.reverse(Integer.MAX_VALUE));
		System.out.println(l7.reverse(-123));
		System.out.println(l7.reverse(123));
	}
}
