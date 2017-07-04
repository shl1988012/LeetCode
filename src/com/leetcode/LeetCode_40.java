package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_40 {

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
	                recurse(copy, newTarget, candidates, i + 1, ret);  
	            } else  
	                break; 
		 }
	 }
}
