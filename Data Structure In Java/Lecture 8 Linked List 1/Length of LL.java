public class Solution {

	public static int length(LinkedListNode<Integer> head){
		LinkedListNode<Integer> temp=head;
        int count=0;
        while(head !=null){
            count++;
            head=head.next;
        }
        return count;
	}
}