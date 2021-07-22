package linkedlists;

public class PrintMiddle {




	public static void main(String[] args) {
		MyLinkedList ll = new MyLinkedList();
		ll.add(10);
		ll.add(12);
		ll.add(8);
		ll.add(6);
		ll.add(3);
		System.out.println(ll.printMiddle());
		//System.out.println(ll.printMiddle2());
		
		ll.deleteMiddle();
		ll.print();
	}

}
