package leetcode;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class dltduplicate {
	public ListNode deleteDuplicates(ListNode head) {
	    ListNode current = head;

	    while (current != null && current.next != null) {
	        if (current.val == current.next.val) {
	            // Skip all the nodes with the duplicate value
	            current.next = current.next.next;
	        } else {
	            // Move current one step forward
	            current = current.next;
	        }
	    }

	    return head;
	}

    public static void main(String[] args) {
        // Test your code here
        // Create sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);

        // Create an instance of Solution class
        dltduplicate solution = new dltduplicate();

        // Call deleteDuplicates method and print the result
        ListNode result = solution.deleteDuplicates(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
