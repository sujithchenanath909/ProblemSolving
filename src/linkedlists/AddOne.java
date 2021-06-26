package linkedlists;
/*
 * Number is represented in linked list such that each digit 
 * corresponds to a node in linked list. Add 1 to it. For example
 *  1999 is represented as (1-> 9-> 9 -> 9) and adding 1 to it should 
 *  change it to (2->0->0->0) 
 */
public class AddOne {
	
	
	static class Node{
		
		int data;
		Node next;
	}
	
	   static Node newNode(int data)
	    {
	        Node new_node = new Node();
	        new_node.data = data;
	        new_node.next = null;
	        return new_node;
	    }
	 
	   
	   
	   static Node addOne(Node head) {
		   
		   int carry=addWithCarry(head);
		   
		   if(carry>0) {
			   
			   Node newNode = newNode(carry);
	            newNode.next = head;
	            return newNode;
			   
		   }
		   return head;
	   }
	   static void printList(Node node)
	    {
	        while (node != null)
	        {
	            System.out.print(node.data);
	            node = node.next;
	        }
	        System.out.println();
	    }

	 static int addWithCarry(Node head) {
		
		 if(head==null)
			 return 1;
		 
		 int res=head.data +addWithCarry(head.next);
		 head.data=res%10;
		 
		 return res/10;
				 
	}



	public static void main(String[] args) {
		 Node head = newNode(1);
	        head.next = newNode(9);
	        head.next.next = newNode(9);
	        head.next.next.next = newNode(9);
	 
	        System.out.print("List is ");
	        printList(head);
	 
	        head = addOne(head);
	        System.out.println();
	        System.out.print("Resultant list is ");
	        printList(head);
	}

}
