package linkedlists;



public class NthNodeFromEnd {
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

		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}

	}
	
	public static int findNth(int n) {
		
		Node temp=head;
		int pos=0;
		int length=getLen();
		if(length-n<0)
			return -1;
		while(pos<length-n) {
			temp=temp.next;
			pos++;
		}
		
		
		return temp.val;
	}
	
	//this is optimised soln with one traversal
	/*steps:
	 * 1.) initialise 2 pointers p and f as head
	 * 2.)move f by n-1 position
	 * 3.)move p and f by one position each until f reaches end 
	 * 4.)return pth value
	 * */
	static int findNthOptimized(int n) {
		
		Node p=head;
		Node f=head;
		int i=1;
		while(i<=n-1) {
			if(f.next==null) {
				return -1;
			}
			f=f.next;
			i++;
		}
		
		while(f.next!=null) {
			p=p.next;
			f=f.next;
		}
		return p.val;
	}
	
	static int getLen() {
		
		Node temp=head;
		int c=0;
		while(temp!=null) {
			
			temp=temp.next;
			c++;
			}
		return c;
	}

	public static void main(String[] args) {

		NthNodeFromEnd ll = new NthNodeFromEnd();
		ll.add(12);
		ll.add(23);
		ll.add(18);
		ll.add(34);
		ll.add(22);
		System.out.println(ll.findNth(6));
		System.out.println(ll.findNthOptimized(6));
	}

}
