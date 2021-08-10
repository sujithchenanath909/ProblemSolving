package linkedlists;

import java.util.Stack;

import linkedlists.NthNodeFromEnd.Node;

public class checkPalindrome {
	static Node head;

	static class Node {
		String val;
		Node next;

		public Node(String data) {
			val = data;
			next = null;
		}
	}

	void add(String data) {

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

		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}

	}
	
	static boolean checkPalindrome() {
		
		Stack<String> s=new Stack<String>();
		Node temp=head;
		boolean ispalin=false;
		while(temp!=null) {
			
			s.push(temp.val);
			temp=temp.next;
		}
		
		 while (head != null) {
			 
	            String i = s.pop();
	            if (head.val == i) {
	                ispalin = true;
	            }
	            else {
	                ispalin = false;
	                break;
	            }
	            head = head.next;
	        }
		
		return ispalin;
	}
	
	public static void main(String[] args) {
	
		checkPalindrome ll=new checkPalindrome();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("b");
		ll.add("a");
		ll.add("e");
		
		System.out.println(ll.checkPalindrome());
		

	}

}
