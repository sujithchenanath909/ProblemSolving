package sopl;
/*
 * 
    Given a Node as a linked list!
Write a simple method that returns a Node with a maximum value less than 0 and even!
Example:
     Given
         Node:
             5 -> -1 -> 7 -> -32 -> 9 -> -2 -> 70
     When method is called
     Then return the Node which has a value of -2
     
    Node find(Node head) {​​​
}​​​

1.)empty node
2.)single node
3.)list with no -ve values
4.)list with multiple same expected result value 

 * */
public class Solution {

	
	 Node find(Node head) {
		 
		 int val,sol=Integer.MAX_VALUE;
		 Node temp;
		 if(head == null) {
		
			 throw new  IllegalArgumentException() ;
			
		 }
		 
		 
		 
		 while(head.hasNext()) {
			 
			 head=head.getNext();
			 
			 val=head.getValue();
			 
			 if(val<0 && val%2==0 && Math.abs(val)<sol ) {
				 
				 sol=val;//32
				 temp=head;
			 }
			 
		 }		 
		 
		 return temp;
		 ​​​
	 }
	 
	 
}

interface Node {
	
    int getValue();
    Node getNext();
    boolean hasNext();
}

