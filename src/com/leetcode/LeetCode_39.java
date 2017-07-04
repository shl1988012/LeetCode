package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Given a set of candidate numbers (C) (without duplicates) and a target number
 * (T), find all unique combinations in C where the candidate numbers sums to T.
 * 
 * The same repeated number may be chosen from C unlimited number of times.
 * 
 * Note: All numbers (including target) will be positive integers. The solution
 * set must not contain duplicate combinations. 
 * 
 * For example, given candidate set
 * [2, 3, 6, 7] and target 7, A solution set is: 
 * [ 
 * 	 [7], 
 *   [2, 2, 3] 
 * ]
 *
 */
public class LeetCode_39 {

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		 List<List<Integer>> ret = new LinkedList<List<Integer>>();  
	        Arrays.sort(candidates);  
	        recurse(new ArrayList<Integer>(), target, candidates, 0, ret);  
	        return ret;  
	}
	
	
	 private void recurse(List<Integer> list, int target, int[] candidates, int index, List<List<Integer>> ret) {  
		 	
		 if(target == 0 ){
			  if(!ret.contains(list))  
	                ret.add(list);  
	            return; 
		 }
		 
		 for(int i = index ; i<candidates.length ; i++){
			 int newTarget = target - candidates[i] ;
			 if(newTarget>=0){
				 List<Integer> copy = new ArrayList<Integer>(list);  
	                copy.add(candidates[i]);  
	                recurse(copy, newTarget, candidates, i , ret);  
	            } else  
	                break; 
		 }
	 }
	
}
