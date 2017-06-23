package com.leetcode;

/**
 * Given a sorted array and a target value, return the index if the target is
 * found. If not, return the index where it would be if it were inserted in
 * order.
 * 
 * You may assume no duplicates in the array.
 * 
 * Here are few examples. 
 * [1,3,5,6], 5 → 2 
 * [1,3,5,6], 2 → 1 
 * [1,3,5,6], 7 → 4
 * [1,3,5,6], 0 → 0
 * 
 *
 */
public class LeetCode_35 {

	public static int searchInsert(int[] nums, int target) {
		if(nums.length==0 || nums==null){
			return 0 ;
		}
		int l =0 , r =nums.length -1 , index = 0;
		
		while(l<=r){
			int mid = (r+l)/2 ;
			if(nums[mid] == target){
				index = mid ;
				return index ;
			}else if(nums[mid] < target){
				l=mid+1 ;
			}else {
				r=mid-1 ;
			}
		}
		if(index !=0){
			return index ;
		}else{
			return r+1 ;   //或者 return l ;
		}
		
	}
	
	public static void main(String[] args) {
		int [] nums ={1,3,5,6};
		System.out.println(searchInsert(nums, 5) );
		System.out.println(searchInsert(nums, 2) );
		System.out.println(searchInsert(nums, 7) );
		System.out.println(searchInsert(nums, 0) );
		
		
	}
	
}
