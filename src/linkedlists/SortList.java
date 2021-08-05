package linkedlists;

import java.util.Arrays;
import java.util.LinkedList;

import linkedlists.ReverseList.Node;

public class SortList {
	
	Node head;
	
	static class Node{
		int val;
		Node next;
		
		public Node(int data) {
			
			val=data;
			next=null;
		}
	}

	public void add(int data) {
		
		Node toAdd=new Node(data);
		if(head==null) {
			head=toAdd;
				return ;
			}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=toAdd;
	}
	
	 void printList(Node node)
	    {
	        while (node != null) {
	            System.out.print(node.val + "->");
	            node = node.next;
	        }
	    }
	 
	 public Node sort(Node head) {
		 int[] arr = new int[getLength(head)];
	        Node curr = head;
	        int i = 0;
	        while (curr != null) {
	            arr[i++] = curr.val;
	            curr = curr.next;
	        }
	        
	        Arrays.sort(arr);
	        curr = head;
	        i = 0;
	        while (curr != null) {
	            curr.val = arr[i++];
	            curr = curr.next;
	        }
	        
	        return head;
	 }
	 
	 public int getLength(Node A) {
	        int l = 0;
	        while (A != null) {
	            A = A.next;
	            l++;
	        }
	        
	        return l;
	    }
	
	public static void main(String[] args) {
	
		SortList ll=new SortList();
		ll.add(12);
		ll.add(16);
		ll.add(3);
		ll.add(8);
		
		ll.printList(ll.head);
		Node sorted=ll.sort(ll.head);
		
		ll.printList(sorted);
	}
	
	
	
	
}


