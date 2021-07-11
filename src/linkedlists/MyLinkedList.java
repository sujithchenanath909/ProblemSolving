package linkedlists;

import javax.naming.ldap.StartTlsRequest;

import linkedlists.ListNode.Node;

public class MyLinkedList {

	Node head;

	static class Node {
		public int val;
		public Node next;

		Node(int x) {
			val = x;
			next = null;
		}
	}

	void add(int data) {
		Node toAdd = new Node(data);
		if (head == null) {
			head = toAdd;
			return;
		}

		Node temp = head;
		while (temp.next != null) {

			temp = temp.next;
		}
		temp.next = toAdd;
	}

	// traversing the ll for length and traversing again till len/2 optimized s
	// solution is below
	public String printMiddle() {
		long startTime=System.currentTimeMillis();
		int result = 0;
		int middlePos = getLen() / 2;
		int start = 0;

		if (head == null)
			return "";

		Node temp = head;
		while (start < middlePos) {

			temp = temp.next;
			start++;
		}
		long endTime=System.currentTimeMillis();
		return temp.val + " In Time " +(endTime-startTime);
	}

	// Traverse linked list using two pointers. Move one pointer by one and
	// the other pointers by two. When the fast pointer reaches the end
	// slow pointer will reach the middle of the linked list.
	public String printMiddle2() {
		long starttime=System.currentTimeMillis();
		int result = 0;
		if (head == null)
			return "";
		Node Slowptr = head;
		Node Fastptr = head;

		while (Fastptr != null && Slowptr != null) {

			Fastptr = Fastptr.next.next;
			Slowptr = Slowptr.next;
		}
		long endTime=System.currentTimeMillis();
		
		return Slowptr.val +"in Time"+(endTime-starttime);

	}
	
	public Node deleteMiddle() {

		int result = 0;
		int middlePos = getLen() / 2;
		int start = 0;

		if (head == null ) {
			System.out.println("**");
			return head;}

		Node temp = head;
		while (start < middlePos-1) {

			temp = temp.next;
			start++;
		}
		System.out.println(temp.val);
		temp.next=temp.next.next;

		return temp;
	}

	public int getLen() {
		int length = 0;
		if (head == null)
			return 0;
		Node temp = head;
		while (temp != null) {
			length++;
			temp = temp.next;
		}
		return length;
	}

	public void print() {

		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}

}
