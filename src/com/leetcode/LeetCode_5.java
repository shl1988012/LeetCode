package com.leetcode;


/**
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 * 	Input: "babad"
 *	Output: "bab"
 *	Note: "aba" is also a valid answer.
 *
 */
public class LeetCode_5 {

	public String longestPalindrome(String s) {
		int length = s.length() ,i =length ;
		while(i>0){
			for(int k=0 ,j=i;k<=(length-i);k++,j++){
				String str = s.substring(k, j);
				if(isPalindrome(str)){
					return str;
				}
			}
			i--;
		}
		return null;
		
	}
	
	//判断一个字符串是否是回文，定义两个游标，一个从字符串头，一个从字符串尾进行判断即可。
	public boolean isPalindrome(String s){
		if(s == null){
			return false;
		}
		int len = s.length();

		for(int i =0,j=len-1 ; i<j; i++,j--){
			if(s.charAt(i) != s.charAt(j)){
				return false;
			}
		}
		
		return true ;
	}
	
	public static void main(String[] args) {
		long start =	System.currentTimeMillis();
		LeetCode_5 l5 = new LeetCode_5() ;
		System.out.println(l5.longestPalindrome("klvxwqyzugrdoaccdafdfrvxiowkcuedfhoixzipxrkzbvpusslsgfjocvidnpsnkqdfnnzzawzsslwnvvjyoignsfbxkgrokzyusxikxumrxlzzrnbtrixxfioormoyyejashrowjqqzifacecvoruwkuessttlexvdptuvodoavspeajjaepvrfvbdhumtuvxufzzyowiswokioyjtzzmevttheeyjqcldllxvjraeyflthntsmipaoyjixygbtbvbnnrmlwwkeikhnnmlfspjgmcxwbjyhomfjdcnogqjviggklplpznfwjydkxzjkoskvqvnxfzdrsmooyciwulvtlmvnjbbmffureoilszlonibbcwfsjzguxqrjwypwrskhrttvnqoqisdfuifqnabzbvyzgbxfvmcomneykfmycevnrcsyqclamfxskmsxreptpxqxqidvjbuduktnwwoztvkuebfdigmjqfuolqzvjincchlmbrxpqgguwuyhrdtwqkdlqidlxzqktgzktihvlwsbysjeykiwokyqaskjjngovbagspyspeghutyoeahhgynzsyaszlirmlekpboywqdliumihwnsnwjc"));
		long end =	System.currentTimeMillis();
		System.out.println(end -start);
	}
}





