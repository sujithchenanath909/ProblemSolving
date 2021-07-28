package linkedlists;

public class ListNode<E> {

	Node<E> head;

	void add(E data) {

		Node<E> toAdd = new Node<E>(data);
		if (isEmpty()) {
			head = toAdd;
			return;
		}
		Node<E> temp = head;
		while (temp.next != null) {

			temp = temp.next;
		}
		temp.next = toAdd;

	}

	public boolean isEmpty() {

		return head == null;

	}

	static class Node<E> {
		E value;
		Node<E> next;

		public Node(E data) {
			this.value = data;
			next = null;
		}
	}
}
