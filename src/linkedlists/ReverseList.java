package linkedlists;

import linkedlists.DetectLoop.Node;

public class ReverseList {
	static Node head;

	static class Node {
		int val;
		Node next = null;

		public Node(int data) {

			val = data;
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

	   void printList(Node node)
	    {
	        while (node != null) {
	            System.out.print(node.val + "->");
	            node = node.next;
	        }
	    }
	
	static Node reverse(Node node) {
		
		 Node prev = null;
	        Node current = node;
	        Node next = null;
	        while (current != null) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }
	        node = prev;
	        return node;
		
	}

	public static void main(String[] args) {
		ReverseList ll=new ReverseList();
		ll.head=new Node(10);
		ll.head.next=new Node(20);
		ll.head.next.next=new Node(30);
		ll.printList(head);
		head=ll.reverse(head);
		System.out.println("List after revision");
		ll.printList(head);

	}

}
