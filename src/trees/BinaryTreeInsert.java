package trees;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Given a binary tree and a key, insert the key into the binary tree at the first position available in level order.
 * Solution:The idea is to do iterative level order traversal of the given tree using queue. 
 * If we find a node whose left child is empty, we make new key as left child of the node. 
 * Else if we find a node whose right child is empty, we make the new key as right child. We keep traversing 
 * the tree until we find a node whose either left or right is empty. 
 * */
public class BinaryTreeInsert {

	static class Node {
		int key;
		Node left, right;

		// constructor
		Node(int key) {
			this.key = key;
			left = null;
			right = null;
		}
	}

	static Node root;
	static Node temp = root;

	static void inOrder(Node temp) {

		if (temp == null)
			return;

		inOrder(temp.left);
		System.out.println(temp.key + " ");
		inOrder(temp.right);

	}
	
	 static void insert(Node temp, int key) {
		 
		 if(temp==null) {
			 
			 root=new Node(key);
			 return;
		 }
		 
		 Queue<Node> q = new LinkedList<Node>();
	        q.add(temp);
	        
	        while(!q.isEmpty()) {
	        	
	        	temp=q.peek();
	        	q.remove();
	        	
	        	if(temp.left == null) {
	        		
	        		temp.left=new Node(key);
	        		break;
	        	}
	        	else
	        		q.add(temp.left);
	        	
	        	if(temp.right==null) {
	        		
	        		temp.right=new Node(key);
	        		break;
	        		
	        	}
	        	else
	        		q.add(temp.right);
	        	
	        	
	        }
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 root = new Node(10);
	        root.left = new Node(11);
	        root.left.left = new Node(7);
	        root.right = new Node(9);
	        root.right.left = new Node(15);
	        root.right.right = new Node(8);
	 
	        System.out.print(
	            "Inorder traversal before insertion:");
	        inOrder(root);
	 
	        int key = 12;
	        insert(root, key);
	 
	        System.out.print(
	            "\nInorder traversal after insertion:");
	        inOrder(root);
	}

}
