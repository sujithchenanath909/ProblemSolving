package linkedlists;

public class ReverseNodeByK {

	static class Node{
		int val;
		Node next;
		
		public Node(int data) {
			val=data;
			next=null;
		}
	}
	
	public static Node reverse(Node node, int k)
    {
        Node next=null;
        Node prev=null;
        Node curr=node;
        int c=0;
        
        while(curr!=null && c<k){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            c++;
        }
        
        if(next!=null){
            node.next=reverse(next,k);
        }
        
        return prev;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
