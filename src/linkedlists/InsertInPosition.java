package linkedlists;

import linkedlists.ListNode.Node;

public class InsertInPosition {

	
	Node InsertNth(Node head, int data, int position) {
	    //Will Need to Return Head Node 
	    Node trackedHeadNode = head;
	    
	    Node nodeToInsert = new Node(data); //nodeToInsert.data = data;
	    
	    //Empty List - Returned newly created node or null
	    if (head==null){return nodeToInsert;}
	    
	    //Inserting a Node ahead of the List
	    if (position == 0){nodeToInsert.next = head; return nodeToInsert;}    
	    
	    //Traverse the Singly Linked List to 1 Position Prior
	    //Stop traversing if you reached the end of the List
	    int currPosition = 0;
	    
	    while (currPosition < position -1 && head.next != null){
	        head = head.next;        
	        currPosition++;       
	    }

	    //Inserting a Node in-between a List or at the end of of a List
	    Node nodeAtPosition = head.next;
	    head.next = nodeToInsert;
	    head = head.next;
	    head.next = nodeAtPosition;
	        
	    return trackedHeadNode;
	}
	
	static class  Node{
		int value;
		Node next;
		
		public Node(int data){
			this.value=data;
			next=null;
		}
	}
}
