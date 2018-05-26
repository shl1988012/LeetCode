package com.leetcode;
/*
'.' Matches any single character.
'*' Matches zero or more of the preceding element.     *浠ｈ〃鐨勬槸瀛楃鍙互鍑虹幇0鎴栬�呬换鎰忓娆� 娉ㄦ剰鍙兘鏄�0娆�

The matching should cover the entire input string (not partial).

The function prototype should be:
bool isMatch(const char *s, const char *p)

Some examples:
isMatch("aa","a") 鈫� false
isMatch("aa","aa") 鈫� true
isMatch("aaa","aa") 鈫� false
isMatch("aa", "a*") 鈫� true
isMatch("aa", ".*") 鈫� true
isMatch("ab", ".*") 鈫� true
isMatch("aab", "c*a*b") 鈫� true

*/

//错了哦
public class LeetCode_10 {

	public boolean isMatch(String s, String p) {
		if(s==null || p==null){
			return false ;
		}
		return true;
	}
}
