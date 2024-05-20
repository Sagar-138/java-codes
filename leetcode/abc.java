package leetcode;

import java.util.*;
import java.io.*;

public class abc {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ListNode head = new ListNode(-1);
		ListNode cur = head;
		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			cur.next = new ListNode(val);
			cur = cur.next;
		}
		ListNode ans = reverseList(head.next);
		while (ans != null) {
			System.out.print(ans.val + " ");
			ans = ans.next;
		}
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static ListNode reverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;

		// 5 -> 4 -> 3 -> 2 -> 1
		ListNode ans = reverseList(head.next);
		head.next.next = head;
//loop avoid
		head.next = null;

		return ans;
	}
}