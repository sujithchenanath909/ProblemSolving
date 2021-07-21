package linkedlists;

import linkedlists.MergeSortLS.node;

public class PartitionLinkedList {
	node head = null;
	static class node {
		int val;
		node next;

		public node(int val) {
			this.val = val;
		}
	}

	void push(int new_data) {
		/* allocate node */
		node new_node = new node(new_data);

		/* link the old list off the new node */
		new_node.next = head;

		/* move the head to point to the new node */
		head = new_node;
	}

	// Utility function to print the linked list
	void printList(node headref) {
		while (headref != null) {
			System.out.print(headref.val + " ");
			headref = headref.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PartitionLinkedList li = new PartitionLinkedList();
		/*
		 * Let us create a unsorted linked list to test the functions created. The list
		 * shall be a: 2->3->20->5->10->15
		 */
		li.push(15);
		li.push(10);
		li.push(5);
		li.push(20);
		li.push(3);
		li.push(2);
		
		
	}

}
