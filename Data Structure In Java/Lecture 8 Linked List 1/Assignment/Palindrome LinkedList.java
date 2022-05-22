import java.util.Stack;

public class Solution {

    public static boolean isPalindrome(LinkedListNode<Integer> head) {

        // It stores the Linked List node value.
        Stack<Integer> st = new Stack<>();

        // Creating temprary Node.
        LinkedListNode<Integer> temp = head;

        while (temp != null) {

            // Add the current node value to stack.
            st.push(temp.data);

            // Move current pointer to next node.
            temp = temp.next;
        }

        while (head != null) {

            // Get the top most element of stack.
            Integer top = st.pop();

            if (!top.equals(head.data)) {
                return false;
            }

            head = head.next;
        }

        return true;

    }

}
