package com.leetcode;

//Implement pow(x, n).

public class LeetCode_50 {

	public double myPow(double x, int n) {

		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			if (n == Integer.MIN_VALUE) {
				++n;
				n = -n;
				x = 1 / x;
				//
				return x * x * myPow( x*x, n/2 );  
			//	return 1.0/ (myPow(x, INT_MAX) * x);
			}else{
				n = -n;
				x = 1 / x;
			}
		}
		return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
	}

	public static void main(String[] args) {

		int a = Integer.MIN_VALUE;
		int m = Integer.MAX_VALUE;

		System.out.println(a);
		System.out.println(m);
	}
}
