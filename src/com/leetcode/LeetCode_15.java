package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? 
//Find all unique triplets in the array which gives the sum of zero.
public class LeetCode_15 {

	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for(int i =0 ; i<nums.length-2 ;i++){
			if(i > 0 && (nums[i] == nums[i-1])) continue;  // avoid duplicates  
			 findAllMatches( nums,i ,list);
		}
		return list;
		
	}
	
	public static void findAllMatches(int[]a,int i ,List<List<Integer>> list){
		int l =i+1;  
        int r = a.length - 1;  
        while(l < r) {  
            if(a[l] + a[r] < - a[i])  
                l++;  
            else if(a[l] + a[r] > - a[i])  
                r--;  
            else {  
            	list.add(Arrays.asList(a[i],a[l],a[r]));
                l++;  
                r--; 
                while(l<r && a[l]==a[l-1]){ // avoid duplicates  
                	l++;
                }
                while(l<r && a[r]==a[r+1]){ // avoid duplicates  
                	r--;
                }
            }  
        }  
	}
	
/*	public List<List<Integer>> threeSum(int[] nums) {  
        Arrays.sort(nums);  
        List<List<Integer>> list = new ArrayList<>();  
        for(int i = 0; i < nums.length-2; i++) {  
            if(i > 0 && (nums[i] == nums[i-1])) continue; // avoid duplicates  
            for(int j = i+1, k = nums.length-1; j<k;) {  
                if(nums[i] + nums[j] + nums[k] == 0) {  
                    list.add(Arrays.asList(nums[i],nums[j],nums[k]));  
                    j++;  
                    k--;  
                    while((j < k) && (nums[j] == nums[j-1]))j++;// avoid duplicates  
                    while((j < k) && (nums[k] == nums[k+1]))k--;// avoid duplicates  
                }else if(nums[i] + nums[j] + nums[k] > 0) k--;  
                else j++;  
            }  
        }  
        return list;  
    }*/ 
	
	//注意下面三种情况。去重问题！
	//-4, -1, -1, 0, 1, 2
	//0,0,0,0
	//-5, -3, -2, -1, 0, 0, 0, 1, 1, 1, 3, 3, 4, 4, 4
/*	public static void main(String[] args) {
		LeetCode_15 l5 = new LeetCode_15();
		int[] nums = {-5, -3, -2, -1, 0, 0, 0, 1, 1, 1, 3, 3, 4, 4, 4};
		
		List<List<Integer>> list =l5.threeSum(nums);
		for(List<Integer> l : list){
			for(Integer i : l){
				System.out.print(i+"  ");
			}
			System.out.println();
		}
	}*/

}





