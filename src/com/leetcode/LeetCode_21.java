package com.leetcode;

/**
 * 21. Merge Two Sorted Lists Merge two sorted linked lists and return it as a
 * new list. The new list should be made by splicing together the nodes of the
 * first two lists.
 *
 */
public class LeetCode_21 {
	
	//方法一： 简单的把两个链表进行比较，然后拼接
	/*public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		 ListNode curr = dummy;
		while(l1!=null && l2!=null){
			if(l1.val<l2.val){
				curr.next=l1 ;
				l1=l1.next;
			}else{
				curr.next =l2;
				l2 = l2.next;
			}
			curr = curr.next;
		}
		if(l1.next ==null){
			curr.next =l2;
		}else{
			curr.next =l1;
		}
		return dummy.next;
	}*/
	
	//方法二 ： 通过递归来实现   : It will occur stack overflow if list length is too long.   可能会导致内存溢出
/*	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null){
			return l2;
		}
		if(l2 == null){
			return l1 ;
		}
		ListNode res ;
		
		if(l1.val<l2.val){
			res = l1;
			res.next = mergeTwoLists(l1.next, l2);
		}else{
			res = l2 ;
			res.next = mergeTwoLists(l1, l2.next);
		}
		
		return res ;
	}*/
	
	
	//方法三
	public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.val < l2.val){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
	}
	
}














