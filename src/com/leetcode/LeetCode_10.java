package com.leetcode;
/*
'.' Matches any single character.
'*' Matches zero or more of the preceding element.     *代表的是字符可以出现0或者任意多次 注意可能是0次

The matching should cover the entire input string (not partial).

The function prototype should be:
bool isMatch(const char *s, const char *p)

Some examples:
isMatch("aa","a") → false
isMatch("aa","aa") → true
isMatch("aaa","aa") → false
isMatch("aa", "a*") → true
isMatch("aa", ".*") → true
isMatch("ab", ".*") → true
isMatch("aab", "c*a*b") → true

*/

public class LeetCode_10 {

	public boolean isMatch(String s, String p) {
		if(s==null || p==null){
			return false ;
		}
		
	}
}
