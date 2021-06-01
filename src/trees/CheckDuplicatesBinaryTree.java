package trees;

import java.util.HashSet;

public class CheckDuplicatesBinaryTree {

	static class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(2);
		root.left.left = new Node(3);
		if (checkDuplicate(root))
			System.out.print("Yes");
		else
			System.out.print("No");
	}

	public static Boolean checkDupUtil(Node root, HashSet<Integer> s) {

		if (root == null)
			return false;

		if (s.contains(root.data))
			return true;

		s.add(root.data);

		return checkDupUtil(root.left, s) || checkDupUtil(root.right, s);

	}

	private static boolean checkDuplicate(Node root) {

		HashSet<Integer> s = new HashSet<>();
		return checkDupUtil(root, s);

	}
}
