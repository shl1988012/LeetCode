package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given a string, find the length of the longest substring without repeating
 * characters. Examples: Given "abcabcbb", the answer is "abc", which the length
 * is 3. Given "bbbbb", the answer is "b", with the length of 1. Given "pwwkew",
 * the answer is "wke", with the length of 3. Note that the answer must be a
 * substring, "pwke" is a subsequence and not a substring.
 *
 */

public class LeetCode_3 {
	
	/**
	 * 
	 * 这种算法相当于是从第一个字节开始遍历，找出最长的，然后从第二个字节遍历，找出最长的，再比较，一直到字符串的末尾。 时间复杂度为0(n3)
	 */
	/*public int lengthOfLongestSubstring(String s) {
		int length = s.length();
		int maxlength =0;
		String result ="";
		for(int j =0 ; j<length ; j++){
			StringBuilder sb = new StringBuilder();
			for(int i =j ; i<length ; i++){
				String subs = String.valueOf(s.charAt(i));
				if(sb.toString().contains(subs)){
					result = sb.length()> maxlength ? sb.toString() : result;
					maxlength = sb.length()> maxlength ? sb.length() : maxlength ;
					break;
				}else{
					sb.append(subs);
				}
			}
			if(maxlength<sb.length()){
				maxlength = sb.length();
			}
		}
		
		return maxlength;
	}*/
	
	/**
	 * sliding window 滑动的窗子
	 * 这种方法的精髓是上一次比较完的后面字符再下一次循环中不需要再比较
	 * eg: s=abcdaeobc ,第一次比较得到“abcd”，第二次则bcd不需要再进行比较，直接跳过bcd，从下一个a开始比较。
	 * 时间复杂度为0(n)
	 * @return
	 */
	/*public int lengthOfLongestSubstring(String s) {
		int n =s.length();
		int max =0, i=0, j=0;
		if(s.length()==0){
			return 0;
		}
		Set<Character> set = new HashSet<Character>();
		while(i<n && j<n){
			if(!set.contains(s.charAt(j))){
				set.add(s.charAt(j++));
				max = Math.max(max , j-i);
			}else{
				set.remove(s.charAt(i++));
			}
		}
		return max;
	}*/
	
	/**
	 * 对于方法二做进一步优化，用map来保存字符的位置
	 * Instead of using a set to tell if a character exists or not, we could define a mapping of the characters to its index. 
	 * Then we can skip the characters immediately when we found a repeated character。
	 * The reason is that if s[j] have a duplicate in the range [i, j) with index j' , 
	 * we don't need to increase i little by little. We can skip all the elements in the range [i, j'] and let i to be j' + 1 directly.
	 * @return
	 */
	 public int lengthOfLongestSubstring(String s) {
	        int n = s.length(), ans = 0;
	        Map<Character, Integer> map = new HashMap<>(); // current index of character
	        // try to extend the range [i, j]
	        for (int j = 0, i = 0; j < n; j++) {
	            if (map.containsKey(s.charAt(j))) {
	                i = Math.max(map.get(s.charAt(j)), i);
	            }
	            ans = Math.max(ans, j - i + 1);
	            map.put(s.charAt(j), j + 1);
	        }
	        return ans;
	    }
	
	public static void main(String[] args) {
		LeetCode_3 l = new LeetCode_3() ;
		System.out.println(l.lengthOfLongestSubstring("abcadcbb"));
		
	}
	
	
}
