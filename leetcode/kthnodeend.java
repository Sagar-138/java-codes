package leetcode;

//Define the ListNode class within the Solution.java file
//class ListNode {
// int val;
// ListNode next;
// 
// ListNode() {}
// 
// ListNode(int val) {
//     this.val = val;
// }
// 
// ListNode(int val, ListNode next) {
//     this.val = val;
//     this.next = next;
// }
//}

//Define the Solution class with a main method
public class kthnodeend {
 public static void main(String[] args) {
     // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6
     ListNode head = new ListNode(1);
     head.next = new ListNode(2);
     head.next.next = new ListNode(3);
     head.next.next.next = new ListNode(4);
     head.next.next.next.next = new ListNode(5);
     head.next.next.next.next.next = new ListNode(6);
     
     // Define the value of n (the position of the node to remove)
     int n = 5;
     
     // Call the removeNthFromEnd method and print the result
     ListNode result = removeNthFromEnd(head, n);
     printList(result);
 }
 
 // Define the removeNthFromEnd method
 public static ListNode removeNthFromEnd(ListNode head, int n) {
     ListNode fast = head, slow = head;
     for (int i = 0; i < n; i++) {
         fast = fast.next;
     }
     
     if (fast == null) {
         return head.next;
     }
         
     while (fast.next != null) {
         slow = slow.next;
         fast = fast.next;
     }
     
     slow.next = slow.next.next;
     return head;
 }
 
 // Helper method to print the linked list
 public static void printList(ListNode head) {
     while (head != null) {
         System.out.print(head.val + " ");
         head = head.next;
     }
     System.out.println();
 }
}
