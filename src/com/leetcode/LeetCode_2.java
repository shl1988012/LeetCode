package com.leetcode;

import java.util.LinkedList;

/**
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 *  Add the two numbers and return it as a linked list.
 You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 *
 */
public class LeetCode_2 {

	

	public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		if(l1 == null){
			return l2 ;
		}else if(l2 ==null){
			return l1;
		}
		int size1 = l1.size();
		int size2 = l2.size();
		int minsize = (size1<size2) ? size1 : size2;
		int maxsize = (size1>size2) ? size1 : size2;
		LinkedList <Integer>l3 = new LinkedList<Integer>();
		int temp=0 , sum =0;
		for(int i=0 ; i< maxsize ; i++){
			if(i>(minsize-1)){
				 sum = l2.get(i)+temp;
			}else{
				 sum = l1.get(i)+l2.get(i)+temp;
			}
			if(sum>=10){
				l3.add(i, sum%10);
				temp =sum/10;
			}else{
				l3.add(i, sum);
				temp=0;
			}
		}
		
		return l3;
	}
	
	public static void main(String[] args) {
		LinkedList <Integer>l1 =new LinkedList<Integer>();
		LinkedList <Integer>l2 =new LinkedList<Integer>();
		//342+1465 = 1807
		l1.add(2);
		l1.add(4);
		l1.add(3);

		l2.add(5);
		l2.add(6);
		l2.add(4);
		l2.add(1);
		LinkedList <Integer>l3 =	addTwoNumbers(l1, l2);
		for(Integer i : l3){
			System.out.println(i);
		}
		
	}
	
	
	
}
