package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Given a digit string, return all possible letter combinations that the number could represent.
//A mapping of digit to letters (just like on the telephone buttons) is given below.
public class LeetCode_17 {

	public List<String> letterCombinations(String digits) {
		String[] data = new String[] { " ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		List<String> result = new ArrayList<String>(Arrays.asList(""));
		for (int i = 0; i < digits.length(); i++) {
			char[] c = data[digits.charAt(i) - '0'].toCharArray();
			List<String> temp = new ArrayList<String>();
			for (int j = 0; j < c.length; j++) {
				for (String s : result){
					temp.add(s + c[j]);
				}
			}
			result =temp;
		}
		return result ;
	}

	/*public static void main(String[] args) {
		 LeetCode_17 l = new LeetCode_17();
		 List<String>list = l.letterCombinations("23");
		 for(String s : list){
			 System.out.print(s+" ");
		 }

	}*/

}
