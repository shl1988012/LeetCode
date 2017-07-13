package com.leetcode;

/**
 * Rotate Image You are given an n x n 2D matrix representing an image.
 * 
 * Rotate the image by 90 degrees (clockwise).
 * 
 * Follow up: Could you do this in-place?
 *
 */
public class LeetCode_48 {

	public void rotate(int[][] matrix) {
		
		int n = matrix.length ;
		int x , y , temp , p ,q ;
		for(int i = 0 ; i <n/2 ; i++){
			
			for(int j = i ; j<n-1-i ;j++){ //两层循环可以获取到倒三角的所有值  http://shmilyaw-hotmail-com.iteye.com/blog/2292710
				x = i;
				y = j ;
				p = matrix[x][y] ; //对这个点旋转4次
				for(int k = 0 ; k<4 ; k++){
					q = matrix[y][n-x-1];
					matrix[y][n-x-1] = p;
					p=q;
					//将x值改为y， y值改为n-x-1 ,再进行下一次循环。
					temp =y ;
					y=n-x-1 ;
					x =temp ;
				}
				
			}
			
		}
		
	}

}
