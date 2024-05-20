package leetcode;
//Definition for singly-linked list
class ListNode1 {
 int val;
 ListNode1 next;
 ListNode1() {}
 ListNode1(int val) { this.val = val; }
 ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
}

public class MergeTwoSortedLists {
 public static void main(String[] args) {
     // Example input: list1 = [1,2,4], list2 = [1,3,4]
     ListNode1 list1 = new ListNode1(1, new ListNode1(2, new ListNode1(4)));
     ListNode1 list2 = new ListNode1(1, new ListNode1(3, new ListNode1(4)));

     MergeTwoSortedLists solution = new MergeTwoSortedLists();
     ListNode1 mergedList = solution.mergeTwoLists(list1, list2);

     // Print the merged list
     while (mergedList != null) {
         System.out.print(mergedList.val + " ");
         mergedList = mergedList.next;
     }
 }

 public ListNode1 mergeTwoLists(ListNode1 list1, ListNode1 list2) {
     ListNode1 dummy= new ListNode1(-1);
     ListNode1 curr= dummy;
     while(list1 != null && list2 !=null){
         if(list1.val<list2.val){
             curr.next=list1;
             list1=list1.next;
         }else{
             curr.next=list2;
             list2=list2.next;
         }
         curr=curr.next;
     }
     if(list1 != null){
         curr.next=list1;
     }else{
         curr.next=list2;
     }
     
     return dummy.next;
 }

}
