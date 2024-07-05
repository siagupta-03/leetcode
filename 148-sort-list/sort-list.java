/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
      //base case
        if(head==null  || head.next==null)return head;

        ListNode mid= middle(head);
        ListNode lefthead= head;
        ListNode righthead= mid.next;

        mid.next=null;
        lefthead= sortList(lefthead);
        righthead= sortList(righthead);
        return merge2(lefthead, righthead);
        
    }
    public ListNode middle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        fast=fast.next;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

        }
        return slow;
    }

    public ListNode merge2(ListNode l1, ListNode l2 ){
        ListNode t1= l1;
        ListNode t2=l2;
        ListNode dummy= new ListNode(-1);
        ListNode temp=dummy;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                temp.next= t1;
                t1=t1.next;
                temp=temp.next;}
                else{
                    temp.next=t2;
                    t2=t2.next;
                    temp=temp.next;

                }
                
        }
        if(t1!=null) temp.next=t1;
        if(t2!=null) temp.next=t2;
        return dummy.next;

    }

}