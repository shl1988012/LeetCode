package com.leetcode;

/**
 * Given an array of integers sorted in ascending order, find the starting and
 * ending position of a given target value.
 * 
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * 
 * If the target is not found in the array, return [-1, -1].
 * 
 * For example, Given [5, 7, 7, 8, 8, 10] and target value 8, return [3, 4].
 *
 */
/**
 * 将这个问题先拆分成两个部分，先求最左边位置的目标值。只要这个能够求出来，最右边的那个也就好办了。
 *
 */
public class LeetCode_34 {
	
	public static int[] searchRange(int[] nums, int target) {
		int l = 0 ;
		int r = nums.length-1;
		int lpos = -1;
		int rpos =-1;
		while(l <= r){
			int mid = l+(r-l)/2 ; //改成 （r+l）/2 ， 可以省一次计算
 			if(nums[mid] == target){
				lpos = mid ;
				r= mid-1; //这行代码为了找到最左的节点
			}else if(nums[mid] < target){
				l = mid+1 ;
			}else{
				r = mid -1 ;
			}
		}
		if(lpos == -1){ 
			int[] result ={-1,-1} ;
			return result ;
		}
		
		l = lpos;
		r = nums.length-1;
		
		while(l<=r){	//查找右节点位置
			int mid = l+(r-l)/2 ;
			if(nums[mid]== target){
				rpos =mid ;
				l = mid+1; //这行代码为了找到最右的节点，l节点一点点的挪
			}else if(nums[mid]<target){
				l =mid+1;
			}else{
				r= mid -1;
			}
		}
		int [] result = {lpos , rpos};
		return result ;
		
	}
	

	

}












