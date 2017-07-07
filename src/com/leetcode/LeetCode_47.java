package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.

For example,
[1,1,2] have the following unique permutations:
[
  [1,1,2],
  [1,2,1],
  [2,1,1]
]
 *
 */

//通过boolean[]来去重 值得一学 ！！！然而代码没有看懂 copy的
public class LeetCode_47 {

	public List<List<Integer>> permuteUnique(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> current = new ArrayList<Integer>();
        boolean[] visited = new boolean[num.length];
        permute(result, current, num, visited);
        return result;
    }
    
    private void permute(List<List<Integer>> result, List<Integer> current, int[] num, boolean[] visited) {
        if (current.size() == num.length) {
            result.add(new ArrayList<Integer>(current));
            return;
        }
        for (int i=0; i<visited.length; i++) {
            if (!visited[i]) {
                if (i > 0 && num[i] == num[i-1] && visited[i-1]) {
                    return;
                }
                visited[i] = true;
                current.add(num[i]);
                permute(result, current, num, visited);
                current.remove(current.size()-1);
                visited[i] = false;
            }
        }
    }

	
	public static void main(String[] args) {
		LeetCode_47 l = new LeetCode_47();
		int[] nums = {1,1,2} ;
		
		List<List<Integer>> list  = l.permuteUnique(nums);
		for(List<Integer> a : list){
			for(Integer i : a){
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}
	
	
}





