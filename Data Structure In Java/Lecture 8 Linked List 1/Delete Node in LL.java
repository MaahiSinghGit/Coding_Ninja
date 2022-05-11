public class Solution {
	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
		// Write your code here.
        
        if(head==null){
            return head;
        }
        
        if(pos==0){
            head=head.next;
            return head;
        }
        
        int i=0;
        LinkedListNode<Integer> temp=head;
        while(temp!=null && i<pos-1){
            temp=temp.next;
            i++;    
        }
        if(temp==null || temp.next==null){
            return head;
        }
        
        temp.next=temp.next.next;
        return head;
        
 
	}
}
