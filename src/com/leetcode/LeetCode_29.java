package com.leetcode;

/**
 * 29. Divide Two Integers . Divide two integers without using
 * multiplication,division and mod operator. If it is overflow, return MAX_INT.
 */
public class LeetCode_29 {
	/**
	 * @param dividend 被除数
	 * @param divisor 除数
	 * @return
	 */
	public int divide(int dividend, int divisor) {
		if(dividend == 0 ){
			return 0;
		}
		//判断除数和被除数的符号是否相同：neg = 0则符号相同 ，neg =1则符号不同
		//异或 相同为0，不同为1
		boolean neg = (dividend<0)^(divisor<0) ; 
		
		long m = Math.abs((long)divisor );
		long n = Math.abs((long)dividend);
		long result = 0 ;
		while(m>=n){
			int shift = 0 ;
			while(m>(n<<shift+1)){ //找到被除数左移的最终的位置
				shift++ ;
			}
			m -= (n<<shift);
			result +=(1<<shift);   //m=17 , n=3 比划下就得到结果了
		}
		result = (neg)? -result : result ; //~(result -1)
		result = Math.min(Integer.MAX_VALUE, result);
		result = Math.max(Integer.MIN_VALUE, result);
		
		return (int)result;
		
	}
}
