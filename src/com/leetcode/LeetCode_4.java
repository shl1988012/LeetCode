package com.leetcode;


/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
	Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
	首先我们先明确什么是median，即中位数。 
	引用Wikipedia对中位数的定义：
	计算有限个数的数据的中位数的方法是：把所有的同类数据按照大小的顺序排列。
	如果数据的个数是奇数，则中间那个数据就是这群数据的中位数；如果数据的个数是偶数，则中间那2个数据的算术平均值就是这群数据的中位数。	
 */
public class LeetCode_4 {

	 //伪代码： 1.先将两个已排序的数组放入一个新数组，再计算中位数。 不考虑时间复杂度
	 public  double findMedianSortedArrays(int[] nums1, int[] nums2) {
		 int len1 = nums1.length;
		 int len2 = nums2.length;
		 int sum = len1+len2;
		 int [] res  = new int[sum];
	     int i=0 , j=0 , index = 0;
	     while(i<len1 && j<len2){
			 if(nums1[i] < nums2[j]){
				 res[index++]= nums1[i];
					 i++;
			 }else{
				 res[index++]= nums1[j];
				 if(j !=(len2-1) ){
					 j++;
				 }
			 }
		 }
	     
	     
	     if((sum & 1) !=0){ //奇数
	    	 return res[index/2]/2;
	     }else{
	    	 return (res[index/2]+res[(index/2)+1])/2;
	     }
		 
		 
	 }
	
	public static void main(String[] args) {
		LeetCode_4 l4= new LeetCode_4();
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
		System.out.println(l4.findMedianSortedArrays(nums1, nums2));
	}
	
	
}






