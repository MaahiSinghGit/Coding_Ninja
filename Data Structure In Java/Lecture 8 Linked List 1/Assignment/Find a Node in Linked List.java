public class Solution {
	public static int findNode(LinkedListNode<Integer> head, int n) {
		// Write your code here.
         if(head==null)
            return -1;
        LinkedListNode<Integer> temp=head;
        int count=0;
        while(temp!=null && temp.data!=n)
        {
            temp=temp.next;
            count++;
        }
        if(temp!=null)
            return count;
        else
            return -1;
	}
}
