package com.leetcode;


/**
 * 
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 *  (you may want to display this pattern in a fixed font for better legibility)
 *  
 *  P   A   H   N
	A P L S I I G
	Y   I   R
	And then read line by line: "PAHNAPLSIIGYIR"
 *
 */

/*n=numRows
Δ=2n-2    1                           2n-1                         4n-3
Δ=        2                     2n-2  2n                    4n-4   4n-2
Δ=        3               2n-3        2n+1              4n-5       .
Δ=        .           .               .               .            .
Δ=        .       n+2                 .           3n               .
Δ=        n-1 n+1                     3n-3    3n-1                 5n-5
Δ=2n-2    n                           3n-2                         5n-4
*/

public class LeetCode_6 {

	
	public String convert(String s, int nRows) {
	    char[] c = s.toCharArray();
	    StringBuilder []sb = new StringBuilder[nRows]; 
		//初始化数组
	    for(int i =0 ; i<nRows ; i++){
	    	sb[i] = new StringBuilder();
	    }
	    int i=0 , len =c.length;
	    while(i<len){
	    	 //垂直向下的赋值
	    	for(int idx=0 ; idx<nRows && i<len; i++,idx++){
	    		sb[idx].append(c[i]);
	    	}
	    	//斜向上的赋值
	    	for(int idx =nRows-2 ; idx>0 && i<len; idx--,i++){
	    		sb[idx].append(c[i]);
	    	}
	    }
	    
	    //对StringBuilder 数组进行组合
	    for(int j=1 ; j< nRows ;j++){
	    	sb[0].append(sb[j]);
	    }
	    return sb[0].toString();
	}
	
	public static void main(String[] args) {
		LeetCode_6 l6 = new LeetCode_6();
		System.out.println(l6.convert("abcdefghijklmn", 4));
	}
}
