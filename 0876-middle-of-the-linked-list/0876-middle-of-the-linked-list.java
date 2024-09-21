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
    public ListNode middleNode(ListNode head) {
        ListNode curr=head;
        int size=1;int mid =0;
        while(curr.next!=null){
            curr=curr.next;
            size++;
        }
        if(size%2==0)
        mid=size/2+1;
        else
            mid =(int) Math.ceil((double)size/2);
        curr=head;
        while(mid>1 && curr.next!=null){
            curr=curr.next;
            mid--;
        }
        return curr;
    }
}