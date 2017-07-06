package com.leetcode;

/**
 * Given two numbers represented as strings, return multiplication of the numbers as a string.

	Note:
	
	The numbers can be arbitrarily large and are non-negative.
	Converting the input string to integer is NOT allowed.
	You should NOT use internal library such as BigInteger
 *
 */
//leetcode上有一种更简单的方法
public class LeetCode_43 {

	
	//大数相加 只做了一个a>b b>a类似
	public static int[] comparePlus(int[] a, int[] b, int numberSystem){
		
		if(a.length > b.length){
			int c[] = new int[a.length+1];
			int carryBit = 0 ; 
			int i;
			for( i =0 ; i< b.length ; i++){
				c[i] = (a[i]+b[i]+carryBit)%numberSystem;
				carryBit = (a[i]+b[i]+carryBit)/numberSystem;
			}
			while(i < a.length)
			{
				c[i] = (a[i] + carryBit) % numberSystem;
				carryBit = (a[i] + carryBit) / numberSystem;
				i++ ;
			}
			c[a.length] = carryBit;
			return c ;
		}
		return null ;
	}
	
	
	
	//大数乘法
	/**
	 * 			1	2
	 * 		1	2	3
	 * --------------------
	 * 			3	6		---mid 每次得到就和c[]求和一次 ，一共求和b.length次数
	 * 		2	4
	 * 	1	2
	 * --------------------
	 */
	public static int[] arrayMultiply(int[] a, int[] b){
		int c[]  = new int[a.length+b.length] ;
		for(int i =0 ; i<b.length ; i++){
			int [] mid = new int[a.length +1]; //保存每一次乘积的中间值
			int carryBit = 0 ;
			for(int j =0 ; j<a.length ; j++){
				mid[j] = (b[i]*a[j]+carryBit)%10 ;
				carryBit = (b[i]*a[j]+carryBit)/10 ;
			}
			mid[a.length] = carryBit ;
			carryBit = 0 ;
			//对mid数组和c数组进行求和，精髓：c[i+k]
			for(int k =0 ; k<mid.length ; k++){
				int sum = mid[k]+c[i+k]+ carryBit ;
				carryBit = sum/10 ;
				c[i+k] = sum%10 ;
			}
		}
		return c ;
	}
	
	 public  String multiply(String num1, String num2) {
	      //将string转成int[]
		 if(num1.equals("0") || num2.equals("0"))  
	            return "0"; 
		 int[] nu1 = toArray(num1);  
	     int[] nu2 = toArray(num2);
	     int[] result =    arrayMultiply(nu1, nu2);
	     
	     StringBuilder builder = new StringBuilder();  
	        if(result[result.length - 1] == 0) {  
	            for(int i = result.length - 2; i >= 0; i--)  
	                builder.append(result[i]);     
	        } else {  
	            for(int i = result.length - 1; i >= 0; i--)  
	                builder.append(result[i]);  
	        }  
	        return builder.toString();  
	 }
	
	
	private int[] toArray(String s) {
		  int len = s.length();  
		int[] list = new int[len];  
		for(int i =0 ; i<len ; i++){
			list[len-1-i] =Character.digit(s.charAt(i), 10);  //划重点！ Character.digit 学习了
		}
		return list;
	}



	/*public static void main(String[] args) {
//		int []a = {2,1};
//		int []b = {3,2,1};
//		System.out.println(LeetCode_43.arrayMultiply(a, b));
		
//		String s = "123";
//		System.out.println(Character.digit(s.charAt(2), 10));
		LeetCode_43 l = new  LeetCode_43() ;
		System.out.println(l.multiply("12", "123"));
	}*/
}





