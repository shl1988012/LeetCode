package com.leetcode;

import java.util.HashSet;
import java.util.Set;

/**36. Valid Sudoku   有效的数独
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

	The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 *
 */
/**
 * int [][] num = new int [3][3]; //定义了三行三列的二维数组
  num[0][0] = 1; //给第一行第一个元素赋值
  num[0][1] = 2; //给第一行第二个元素赋值
  num[1][0] = 4; //给第二行第一个元素赋值
  num[1][1] = 5; //给第二行第二个元素赋值
 *
 */
public class LeetCode_36 {

	
	 public boolean isValidSudoku(char[][] board) {
	     if(board == null || board.length !=9 || board[0].length !=9){
	    	 return false ;
	     }   
	     int n = board.length ; 
	     //每一横行的判断
		 for(int i = 0 ; i<n ;i++ ){ 
			 Set<Character> set = new HashSet<Character>();
			 for(int j = 0 ; j<n ; j++){
				 if(!isValid(set, board, i, j)){
					 return false ;
				 }
			 }
		 }
	     
		  //每一竖行的判断
		 for(int j = 0 ; j<n ; j++){
			 Set<Character> set = new HashSet<Character>();
			 for(int i = 0 ; i<n ;i++ ){ 
				 if(!isValid(set, board, i, j)){
					 return false ;
				 }
			 }
		 }
		 
		 //九个矩形的判断
		 for(int i =0 ; i<n ;i+=3){
			 for(int j = 0 ; j<n ; j+=3){  //得到九个矩形的起点
				 Set<Character> set = new HashSet<Character>();
				 for(int l = i; l < i + 3; l++) {  
					    for(int r = j; r < j + 3; r++)  
					    	if(!isValid(set, board, l, r)){
								 return false ;
							 }
					}  
			 }
		 }
		 return true ;
	 }
	 
	 private boolean isValid(Set<Character> set, char[][] board,int i , int j){
		 if(board[i][j]=='.'){
			 return true ;
		 }
		 if(board[i][j]<'1' || board[i][j]>'9'){
			 return false ;
		 }
		 if(set.contains(board[i][j])){
			 return false ;
		 }
		 set.add(board[i][j]);
		 return true ;
	 }
	
}
