package linkedlists;


public class DeleteDuplicates {

	static Node head;

	static class Node {
		public int val;
		public Node next;

		Node(int x) {
			val = x;
			next = null;
		}
	}

	static void add(int data) {
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

	public int getLen() {
		int length = 0;
		if (head == null)
			return 0;
		Node temp = head;
		while (temp != null) {
			length++;
			temp = temp.next;
		}
		return length;
	}

	static public void print() {

		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}
	Node removeDuplicates(Node head)
    {
        if(head==null || head.next==null)
            return head;
        Node temp=head;
	    while(temp.next!=null){
	        	while(temp.val == temp.next.val) {
				
				temp.next=temp.next.next;
				if(temp.next == null)
				break ;
			}
			if(temp.next !=null)
			temp=temp.next;
			else
			break;

	    }
	    
	    return head;
    }
	
	public static void main(String[] args) {
		//DeleteDuplicates ll=new DeleteDuplicates();
		add(2);
		add(2);
		add(2);
		add(3);
		add(3);
		add(8);
		print();
		System.out.println("**");
		deleteDuplicates();
		print();
	}

}
