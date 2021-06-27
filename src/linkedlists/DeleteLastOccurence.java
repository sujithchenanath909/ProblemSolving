package linkedlists;

import linkedlists.NthNodeFromEnd.Node;

/*
 * Delete last occurance of a given key from a linked list
 * */
public class DeleteLastOccurence {
	static Node head;

	static class Node {
		int val;
		Node next;

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

	void print() {
		Node temp=head;
		while (temp != null) {
			System.out.print(temp.val + "->");
			temp = temp.next;
		}

	}
	
	static void deleteLast(int key) {
		
		Node point=null;
		Node temp=head;
		
		while(temp!=null) {
			if(temp.val==key) {
				point=temp;
			}
			temp=temp.next;
		}

		
		if(point!=null && point.next==null) {
			
			temp=head;
			while(temp.next != point) {
				temp=temp.next;
			}
			temp.next=null;
		}
		
		if(point!=null && point.next!=null) {
			
			point.val=point.next.val;
			temp=point.next;
			point.next=point.next.next;
			
		}
		
	}
	public static void main(String[] args) {
		DeleteLastOccurence ll = new DeleteLastOccurence();
		ll.add(12);
		ll.add(23);
		ll.add(18);
		ll.add(34);
		ll.add(23);
		ll.add(30);
		ll.print();
		ll.deleteLast(30);
		System.out.println("");
		ll.print();
	}

}
