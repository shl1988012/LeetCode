package com.leetcode;

/**
 * Implement strStr() Returns the index of the first occurrence of needle in
 * haystack, or -1 if needle is not part of haystack.
 */
public class LeetCode_28 {

	public int strStr(String haystack, String needle) {
		if(haystack == null || needle==null){
			return -1 ;
		}
		if(haystack.length() < needle.length() ){
			return -1 ;
		}
		int needleLength = needle.length() ;
		for(int i = 0 ; i<haystack.length()- needle.length()+1 ; i++){
			if(isMatch(i, haystack, needle ,needleLength)){
				return i;
			}
		}
		return -1 ;
	}

	private boolean isMatch(int i , String haystack, String needle ,int needleLength){
		for( int j = 0 ; j<needleLength ; j++ ){
			if(needle.charAt(j)!= haystack.charAt(i)){
				return false ;
			}
			i++ ;
		}
		return true ;
	}
}
