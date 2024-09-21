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
    public ListNode mergeTwoLists(ListNode c1, ListNode c2) {
       ListNode head=new ListNode();
       ListNode curr=head;
       while(c1!=null && c2!=null){
        if(c1.val<=c2.val){
            curr.next=c1;
            c1=c1.next;
        }
        else {
            curr.next=c2;
            c2=c2.next;
        } 
        curr=curr.next;    
       }
       System.out.println(curr.val);
       while(c1!=null){
        curr.next=c1;
        c1=c1.next;
        curr=curr.next;
       }
       while(c2!=null){
        curr.next=c2;
        c2=c2.next;
        curr=curr.next;
       }
       curr.next=null;
       return head.next;

    }
}