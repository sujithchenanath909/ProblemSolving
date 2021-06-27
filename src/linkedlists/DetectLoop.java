package linkedlists;

public class DetectLoop {
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

		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}

	}

	boolean detectLoop() {

		Node p = head;
		Node q = head;

		while (p != null && q != null && q.next != null) {

			p = p.next;
			q = q.next.next;

			if (p == q) {

				return true;
			}
		}

		return false;
	}
	
	void makeCycle(int pos) {
		Node temp=head;
		Node startNode = null;
		
		int count=1;
		while(temp.next !=null) {
			
			if(count==pos) {
				startNode=temp;
			}
			temp=temp.next;
			count++;
		}
		
		temp.next=startNode;
	}

	Node firstPositionOfLoop(Node p, Node head) {

		Node q = head;

		while (p != q) {

			p = p.next;
			q = q.next;
		}
		return p;
	}
	
	void removeloop() {
		

		Node p = head;
		Node q = head;
		
		do {
			p=p.next;
			q=q.next.next;
		}while(p!=q);
		
		p=head;
		
		if(p==head && q==head) {
			q=q.next;
			while(q.next!=head) {
				q=q.next;
			}
			q.next=null;
			return ;
		}
		
		while(p.next!=q.next) {
			q=q.next;
			p=p.next;
		}
		q.next=null;
    }
	

	public static void main(String[] args) {

		DetectLoop ll = new DetectLoop();
		ll.add(12);
		ll.add(23);
		ll.add(18);
		ll.add(34);
		ll.add(22);
		ll.makeCycle(1);
		//ll.print();
		if(ll.detectLoop()){
			ll.removeloop();
		}
		ll.print();
		
	}

}
