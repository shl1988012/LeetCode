package com.leetcode;

/**
 * 
 * Given n non-negative integers a1, a2, ..., an, where each represents a point
 * at coordinate (i, ai). n vertical lines are drawn such that the two endpoints
 * of line i is at (i, ai) and (i, 0). Find two lines, which together with
 * x-axis forms a container, such that the container contains the most water.
 *
 */
public class LeetCode_11 {

	public int maxArea(int[] height) {
		int area =0;
		int i=0,j =height.length-1;
		
		while( i< j){
			area=	Math.max(area, (height[i]<height[j] ? height[i] : height[j])*(j-i));
			
			if(height[i] > height[j]) j--; else i++;
		}
		return area ;
		
	}

	
	public static void main(String[] args) {
		LeetCode_11 l11 = new LeetCode_11();
		int [] i ={23,43,56,78,43,2,15,656,77,42,22};
		System.out.println(l11.maxArea(i));
		
	}
}
