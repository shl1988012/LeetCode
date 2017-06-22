package com.leetcode;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? 
 * Find all unique quadruplets in the array which gives the sum of target.
 * 
 *For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.
	A solution set is:
	[
	  [-1,  0, 0, 1],
	  [-2, -1, 1, 2],
	  [-2,  0, 0, 2]
	]
 */
public class LeetCode_18 {
	
	 public List<List<Integer>> fourSum(int[] num, int target) {
		 if(num.length<4){
			 return new ArrayList<List<Integer>>();
		 }
		 Map<Integer,List<SimpleEntry<Integer, Integer>>> map = new HashMap<Integer,List<SimpleEntry<Integer, Integer>>>();
		 List<List<Integer>> result = new ArrayList<List<Integer>>(); 
		 Arrays.sort(num);
		 //num已经排序
		 for(int i = 0 ; i<num.length ; i++){
			 for(int j = i+1 ; j<num.length ; j++){
				 
				 if(map.containsKey(target-num[i]-num[j])){
					 for(SimpleEntry<Integer, Integer> entry : map.get(target-num[i]-num[j])){
						 if(entry.getKey()!=i && entry.getKey()!=j &&
								 entry.getValue()!=i && entry.getValue()!=j ){
							 List<Integer> list = new ArrayList<Integer>();
							 list.add(num[entry.getKey()]);
							 list.add(num[entry.getValue()]);
							 list.add(num[i]);
							 list.add(num[j]);
							 Collections.sort(list);
							 if(!result.contains(list)){
								 result.add(list);
							 }
						 }
					 }
				 }
				 if(map.containsKey(num[i]+num[j])){
					 map.get(num[i]+num[j]).add(new SimpleEntry<Integer, Integer>(i, j));
				 }else{
					 List<SimpleEntry<Integer, Integer>> item = new ArrayList<SimpleEntry<Integer, Integer>>();
					 item.add(new SimpleEntry<Integer, Integer>(i, j));
					 map.put(num[i]+num[j], item);
				 }
			 }
		 }
		 return result;
	 }
}
