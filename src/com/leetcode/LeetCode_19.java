package com.leetcode;

//Remove Nth Node From End of List
public class LeetCode_19 {
	// Given linked list: 1->2->3->4->5, and n = 2.
	// After removing the second node from the end, the linked list becomes
	// 1->2->3->5.
	
	//	1-->2-->3-->4-->5, 	and n = 2
	//			|	|		|
	//			|	|		|	
	//		   pre second	first
	//second就在要删除的节点的位置，pre在second的前置节点
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		
		if(head == null || n<1){
			return head;
		}
		ListNode first = head , second = head , pre =null;
		
		for(int i =0 ; i< n ; i++){
			if(first == null){
				return head ;
			}
			first = first.next;
		}
		
		while(first != null){
			first = first.next ;
			pre = second ;	//注意这行代码，pre相当于second的前置
			second = second.next;
		}
		
		if(second == head ){
			return second.next ;
		}
		pre.next = second.next;
		
		return head ;
	}
}
