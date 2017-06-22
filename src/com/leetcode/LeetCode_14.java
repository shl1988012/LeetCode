package com.leetcode;

//Write a function to find the longest common prefix string amongst an array of strings.
public class LeetCode_14 {
	
	/**
	 * 比较我自己的做法和别人的答案，
	 * 如果arrays的值过多，我的做法就很渣。别人的答案值得借鉴
	 * 学习 while(arrays[i].indexOf(pre) != 0) 这行代码
	 * @param arrays
	 * @return
	 */
	public static String getPrefix(String[]arrays){
		/*if(arrays.length ==0){
			return "";
		}
		int min_length = arrays[0].length();
		for(String str :arrays){
			min_length = (str.length()>min_length)? min_length : str.length();
		}
		String prefix ="";
		for(int i =1 ; i<=min_length ; i++){
			
			 prefix =  arrays[0].substring(0,i);
			for(String str :arrays){
				if(!prefix.equals(str.substring(0,i))){
					if(i ==1){
						return "" ;	
					}
					return  arrays[0].substring(0,i-1);
				}
			}
		}
		return prefix;*/
		
		if (arrays.length == 0) return "";
	    String pre = arrays[0];
	    for (int i = 1; i < arrays.length; i++)
	        while(arrays[i].indexOf(pre) != 0)
	            pre = pre.substring(0,pre.length()-1);
	    return pre;
	}
	
	public static void main(String[] args) {
		String[] arrays = {"abb","abc","addd","a"};
		System.out.println(LeetCode_14.getPrefix(arrays));	
	}
	
}








