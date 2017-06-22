package com.leetcode;

//String to Integer (atoi)
//Implement atoi to convert a string to an integer.
public class LeetCode_8 {
	
	public int myAtoi(String str) {
		str = str.trim(); //去除前后空白格
		if(str ==null ||str.length()==0){
			return 0;
		}
		int index =0 , sign =1 , total =0;
		if(str.charAt(index)=='+' || str.charAt(index)=='-'){
			sign =( str.charAt(index)=='+')? 1: -1;
			index ++ ;
		}
		
		while(index < str.length()){
			int digit = str.charAt(index)-'0';
			if(digit<0 || digit>9){
				break;
			}
			
			//判断是否溢出    后面括号内的判断是临界条件
			//check if total will be overflow after 10 times and add digit
			if(Integer.MAX_VALUE/10 < total || (Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < digit)){
				 return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
			
			//注意注意： 下面的代码是错误的！   total * 10==Integer.MAX_VALUE 和  Integer.MAX_VALUE/10 == total 并不一样
			/*if(total * 10>Integer.MAX_VALUE ||(total * 10==Integer.MAX_VALUE && Integer.MAX_VALUE % 10 < digit )){
				 return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}*/
			total = 10 * total + digit;
			index ++;
		}
		return total * sign;
	}
	
	
	
	public static void main(String[] args) {
		LeetCode_8 l8 = new LeetCode_8();
		String str ="-2147483647";
		System.out.println(l8.myAtoi(str));
	}
	
}
