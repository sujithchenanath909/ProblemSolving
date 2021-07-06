package linkedlists;

import java.util.Stack;

/*
 * Given some resources in the form of linked list you have to
 *  canceled out all the resources whose sum up to 0(Zero) and
 *   return the remaining list.
 *   E.g-->> 6 -6 8 4 -12 9 8 -8
 *   the above example lists which gets canceled :
 *   6 -6
 *   8 4 -12
 *   8 -8
 *   o/p : 9
 *   case 3 : 4 6 -10 8 9 10 -19 10 -18 20 25O/P : 20 25
 *  
 * */

public class DeleteZeroList {
	static node head = null;

	// node a, b;
	static class node {
		int val;
		node next;

		public node(int val) {
			this.val = val;
		}
	}

	//if consecutive values are summing to zero
	public static node deleteZeros() {
		
		if(head==null || head.next==null)
			return head;
		node temp=head;
		int sum=0;
		while(temp!=null) {
			
			sum+=temp.val;
			if(sum==0)
				head=temp.next;
			temp=temp.next;
		}
		
		return head;
		
	}
	
	// Note: does not compile! assumes negative numbers are after positive numbers in list
	static Stack<node> removeCancellableNodes(node listHead)
	{
		if (listHead == null) return null; // or listHead
		Stack<node> stack = new Stack<node>();
		node node = listHead;  	
		while(node != null)
		{
			if (node.val < 0)
			{
				int sum = node.val;
	                        while (!stack.isEmpty())
				{
					node temp = stack.pop();
					sum -= temp.val;
					temp = null;
					if (sum == 0)
					{
						node = stack.peek();
						break;
					}
				}
			}
			else
			{
				stack.push(node);
			}
			node = node.next;
		}
		
		return stack;
	}


	void push(int new_data) {
		/* allocate node */
		node new_node = new node(new_data);

		/* link the old list off the new node */
		new_node.next = head;

		/* move the head to point to the new node */
		head = new_node;
	}

	// Utility function to print the linked list
	void printList(node headref) {
		while (headref != null) {
			System.out.print(headref.val + " ");
			headref = headref.next;
		}
	}

	public static void main(String[] args) {

		DeleteZeroList li = new DeleteZeroList();

		li.push(-8);
		li.push(8);
		li.push(9);
		li.push(-12);
		li.push(4);
		li.push(8);
		//li.push(9);
		li.push(-6);
		li.push(6);
		
		li.printList(head);
		System.out.println("**");
		node res=deleteZeros();
		li.printList(res);
		
	
	}
}


