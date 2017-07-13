package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**49. Group Anagrams
 * Given an array of strings, group anagrams together.

For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
Return:

[
  ["ate", "eat","tea"],
  ["nat","tan"],
  ["bat"]
]
 *
 */

public class LeetCode_49 {
	
	public List<List<String>> groupAnagrams(String[] strs) {
        
		List<List<String>> result = new ArrayList<List<String>>() ;
		Map<String,List<String>> map = new HashMap<String, List<String>>();
		for(String s : strs){
			char[] chars = s.toCharArray();
			Arrays.sort(chars);
			String key = String.valueOf(chars);
			if(!map.containsKey(key)){
				map.put(key, new ArrayList<String>()) ;
			}
			map.get(key).add(s);
		}
		
		for(String key : map.keySet()){
			List<String> list = map.get(key);
			Collections.sort(list);
			result.add(list);
		}
		return result ;
    }
}
