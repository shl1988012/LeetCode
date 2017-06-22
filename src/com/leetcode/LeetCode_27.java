package com.leetcode;

/**
 * 27 Remove Element Given an array and a value, remove all instances of that
 * value in place and return the new length.
 * 
 * Do not allocate extra space for another array, you must do this in place with
 * constant memory.
 * 
 * The order of elements can be changed. It doesn't matter what you leave beyond
 * the new length.
 * 
 * Example: Given input array nums = [3,2,2,3], val = 3
 * 
 * Your function should return length = 2, with the first two elements of nums
 * being 2.
 */
public class LeetCode_27 {

	public static int removeElement(int[] nums, int val) {
		
		int i = 0 , n = nums.length ;
	    while (i < n) {
	        if (nums[i] == val) {
	            nums[i] = nums[n - 1];
	            n--;
	        }
	        else
	            i++;
	    }
	    return n;
	}
	
//	public static void main(String[] args) {
//		int[] nums ={2,3,3,3,2,4,3,5,6};
//		int length =	removeElement(nums, 3);
//		System.out.println(length);
//	}
}
