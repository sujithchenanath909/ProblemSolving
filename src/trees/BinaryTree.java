package trees;

public class BinaryTree {

	Node root;
	
	public BinaryTree(int key) {
		
		root=new Node(key);
	}
	
	BinaryTree(){
		
		root=null;
	}
	
	
	public  static  void main(String[] args) {
		
		  /* creating this tree
        1
    /       \
   2          3
 /   \       /  \
4    null  null  null
/   \
null null
*/
		
		BinaryTree tree=new BinaryTree();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		
		
		
	}
	
}

class Node{
	
	int key;
	Node left,right;
	
	public Node(int item) {
		
		key=item;
		left=right=null;
		
	}
	
}