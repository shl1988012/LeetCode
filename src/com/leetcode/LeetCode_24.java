package com.leetcode;
/*Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.
*/
public class LeetCode_24 {

	public ListNode swapPairs(ListNode head) {
		
		if(head == null || head.next == null){
			return head ;
		}
		ListNode temp = new ListNode(0);
		temp.next = head ;
		ListNode pre = temp , first = null ,second = null;
		while(pre.next !=null && pre.next.next !=null){
			first =pre.next.next;
			second = pre.next;
			second.next = first.next;
			first.next =second;
			pre.next =first;
			pre =second ;
		}
		return temp.next ;
	}
}
