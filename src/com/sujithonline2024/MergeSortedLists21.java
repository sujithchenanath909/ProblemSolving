package com.sujithonline2024;

public class MergeSortedLists21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 public ListNode mergeTwoListsReccursive(ListNode list1, ListNode list2) {
         if(list1!=null && list2!=null){
        if(list1.val<list2.val){
            list1.next=mergeTwoListsReccursive(list1.next,list2);
            return list1;
            }
            else{
                list2.next=mergeTwoListsReccursive(list1,list2.next);
                return list2;
        }
        }
        if(list1==null)
            return list2;
        return list1;
    }
}

/**
 * Definition for singly-linked list.
 */
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 