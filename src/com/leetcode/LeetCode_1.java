package com.leetcode;

import java.util.HashMap;
import java.util.Map;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.

public class LeetCode_1 {
	
	public int[] twoSum(int[] numbers, int target) {
		int resurt[] = new int[2];
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0 ; i<numbers.length ;i++){
			if(map.containsKey(target-numbers[i])){
				resurt[0]=map.get(target-numbers[i]);
				resurt[1] = i;
				return resurt;
			}
			map.put(numbers[i], i);
		}
		return resurt;
	}
	
	public static void main(String[] args) {
		
		int[] numbers= {3,3,8,61,0,-1,456,57,42,15,76};
		int target = 6;
		LeetCode_1 l = new LeetCode_1();
		int[] anw = l.twoSum(numbers, target);
		for(int i =0 ; i<anw.length;i++){
			System.out.print(anw[i]+"  ");
		}
	}
    //这是master分支
	//我来合并develop分支
	//结果为：
	//这是dev分支
	//这是master分支
	//我来合并develop分支

}
