package linkedlists;

import javax.naming.ldap.StartTlsRequest;

import linkedlists.ListNode.Node;

public class DeleteMiddleList {

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
	public Node printMiddle() {
System.out.println("in method");
		int result = 0;
		int middlePos = getLen() / 2;
		int start = 0;

		if (head == null ) {
			System.out.println("**");
			return head;}

		Node temp = head;
		while (start < middlePos) {

			head = head.next;
			start++;
		}
		System.out.println(head.val);
		head.next=head.next.next;

		return head;
	}


	// Traverse linked list using two pointers. Move one pointer by one and
	// the other pointers by two. When the fast pointer reaches the end
	// slow pointer will reach the middle of the linked list.
	public Node printMiddle2() {
		long starttime=System.currentTimeMillis();
		int result = 0;
		if (head == null || head.next==null)
			return head;
		Node Slowptr = head;
		Node Fastptr = head;

		while (Fastptr != null && Slowptr != null) {

			Fastptr = Fastptr.next.next;
			Slowptr = Slowptr.next;
		}
		long endTime=System.currentTimeMillis();
		
		return head ;

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
	public static void main(String[] args) {
		DeleteMiddleList ll = new DeleteMiddleList();
		
			ll.add(10);
			ll.add(12);
			ll.add(8);
			ll.add(6);
			ll.add(3);
			
		Node res=new DeleteMiddleList().printMiddle();
		ll.print();
	}
}
