package linkedList;

public class LinkedList {
	public static class Node{
		int data;
		Node next;
		public  Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public static Node head;
	public static Node tail;
	
//	public static int add() {
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll= new LinkedList();
		ll.head=new Node(1);
		

	}

}
