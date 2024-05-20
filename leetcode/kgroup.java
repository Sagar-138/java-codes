package leetcode;
import java.util.*;


class Node {
    int val;
    Node next;
    Node() {}
    Node(int val) { this.val = val; }
    Node(int val, Node next) { this.val = val; this.next = next; }
}

public class kgroup {
    public int len(Node head) {
        int sz = 0;
        while (head != null) {
            sz++;
            head = head.next;
        }
        return sz;
    }

    public Node reverseKGroup(Node head, int k) {
        int n = len(head);
        int groups = n / k;
        Node prevHead = null, currHead = head, ansNode = null;
        for (int i = 0; i < groups; i++) {
            Node prev = null, curr = currHead, nextNode = null;
            for (int j = 0; j < k; j++) {
                nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }
            if (prevHead == null) {
                ansNode = prev;
            } else {
                prevHead.next = prev;
            }
            prevHead = currHead;
            currHead = curr;
        }
        prevHead.next = currHead;
        return ansNode;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input list size
        System.out.println("Enter the number of elements in the linked list:");
        int size = scanner.nextInt();

        // Input list elements
        System.out.println("Enter the elements of the linked list:");
        Node head = null;
        Node tail = null;
        for (int i = 0; i < size; i++) {
            int val = scanner.nextInt();
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        print(head);
        
        // Input k value
//        System.out.println("Enter the value of k:");
//        int k = scanner.nextInt();
//
//        kgroup solution = new kgroup();
//        Node reversedList = solution.reverseKGroup(head, k);

        // Output the reversed list
//        System.out.println("Reversed list:");
//        while (reversedList != null) {
//            System.out.print(reversedList.val + " ");
//            reversedList = reversedList.next;
//        }
//
//        scanner.close();
    }
    
    public static void print(Node head) {
    	while(head!=null) {
    		System.out.print(head.val+" ");
    		head=head.next;
    	}
    	System.out.println();
    }
}
