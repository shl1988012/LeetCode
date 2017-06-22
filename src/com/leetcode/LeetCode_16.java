package com.leetcode;

import java.util.Arrays;

/*Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target.
 *  Return the sum of the three integers. You may assume that each input would have exactly one solution.

For example, given array S = {-1 2 1 -4}, and target = 1.

The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
*/
public class LeetCode_16 {

	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int result =0 , dif = Integer.MAX_VALUE;
		for(int i =0 ; i<nums.length-2 ; i++){
			int l =i+1;  
	        int r = nums.length - 1;  
	        while(l < r) {  
	            if(nums[l] + nums[r] < target- nums[i]) {
	            	if(target -nums[i]-nums[l]-nums[r] < dif){
	            		result = nums[i]+nums[l]+nums[r];
	            		dif= target -nums[i]-nums[l]-nums[r];
	            	}
	            	 l++;  
	            }  else if(nums[l] + nums[r] >target - nums[i])  {
	            	if(nums[i]+nums[l]+nums[r]-target < dif){
	            		result = nums[i]+nums[l]+nums[r];
	            		dif = nums[i]+nums[l]+nums[r]-target ;
	            	}
	            	r--;  
	            } else {  
	            	return target;
	            }  
	        } 
		}	
		return result ;
	}
	

	public static void main(String[] args) {
		LeetCode_16 l6 = new LeetCode_16();
		int[] nums = {1,2,5,10,11};
		System.out.println(l6.threeSumClosest(nums,12)); 
	}
	
}
