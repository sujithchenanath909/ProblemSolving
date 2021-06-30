package linkedlists;

import linkedlists.DeleteLastOccurence.Node;

public class AddTwoNumbers {

	Node head;

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
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "->");
			temp = temp.next;
		}

	}
	
	 public static Node addTwoNumbers(Node A, Node B) {
		    Node dummy = new Node(-1);
		    Node curr = dummy;
		    int carry = 0;
		    while (A != null || B != null || carry > 0) {
		      int temp = carry + (A != null ? A.val : 0) + (B != null ? B.val : 0);
		      carry = temp > 9 ? 1 : 0;
		      temp %= 10;
		      curr.next = new Node(temp);
		      curr = curr.next;
		      A = A != null ? A.next : A;
		      B = B != null ? B.next : B;
		    }
		    return dummy.next;
		  }
	public static void main(String[] args) {
		AddTwoNumbers l1 = new AddTwoNumbers();
		AddTwoNumbers l2 = new AddTwoNumbers();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l2.add(1);
		l2.add(1);
		l2.add(1);
		l2.add(7);
		
	Node n=	addTwoNumbers(l1.head,l2.head);
	while(n!=null) {
		
		System.out.println(n.val+ "->");
		n=n.next;
	}
		
	}
}
