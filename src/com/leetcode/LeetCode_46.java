package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Permutations Given a collection of distinct numbers, return all possible
 * permutations.
 * 
 * For example, [1,2,3] have the following permutations: [ [1,2,3], [1,3,2],
 * [2,1,3], [2,3,1], [3,1,2], [3,2,1] ]
 */
public class LeetCode_46 {
	// 递归实现，如果数组大，效率低，而且可能栈溢出。
//这种实现其实就是先放1，然后放2，两种结果[[1,2],[2,1]],再放3 ，各有三种结果。
	/**
	 * nums = 1,2,3

start = 0, permutation = []
i = 0, newPermutation = [1]
	start = 1, permutation = [1]
	i = 0, newPermutation = [2, 1]
		start = 2, permutation = [2, 1]
		i = 0, newPermutation = [3, 2, 1]
		i = 1, newPermutation = [2, 3, 1]
		i = 2, newPermutation = [2, 1, 3]
	i = 1, newPermutation = [1, 2]
		start = 2, permutation = [1, 2]
		i = 0, newPermutation = [3, 1, 2]
		i = 1, newPermutation = [1, 3, 2]
		i = 2, newPermutation = [1, 2, 3]
	 */
	 public List<List<Integer>> permute(int[] nums) {
			List<List<Integer>> permutations = new ArrayList<>();
			if (nums.length == 0) {
				return permutations;
			}

			collectPermutations(nums, 0, new ArrayList<Integer>(), permutations);
			return permutations;
	    }

		private void collectPermutations(int[] nums, int start, List<Integer> permutation,
	 			List<List<Integer>>  permutations) {
			
			if (permutation.size() == nums.length) {
				permutations.add(permutation);
				return;
			}

			for (int i = 0; i <= permutation.size(); i++) {
				List<Integer> newPermutation = new ArrayList<>(permutation);
				newPermutation.add(i, nums[start]);
				collectPermutations(nums, start + 1, newPermutation, permutations);
			}
		}
	

	
}
