package linkedlists;

public class ReverseBetweenNodes {

	static class ListNode{
		int data;
		ListNode next;
		
		public ListNode(int val) {			
			data=val;
			next=null;
		}
	}
	
	public ListNode reverseBetween(ListNode A, int B, int C) {
        if(A==null || B==C){
        return A;
    }
    
    ListNode fakeHead=new ListNode(-1);
    fakeHead.next=A;
    int pos=1;
    //go m-1 places
    ListNode start=fakeHead;
    ListNode curr=A;
    while(pos<B){
        start=curr;
        curr=curr.next;
        pos++;
    }
    
    //reverse n posits
    ListNode prev=null;
    ListNode tail=curr;
    while(pos<=C){
        ListNode future=curr.next;
        curr.next=prev;
        prev=curr;
        curr=future;
        pos++;
    }
    start.next=prev;
    tail.next=curr;
    return fakeHead.next;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
