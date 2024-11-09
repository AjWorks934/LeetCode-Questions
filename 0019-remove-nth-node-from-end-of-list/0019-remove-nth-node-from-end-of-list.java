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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head, slow = head;
        for (int i = 0; i < n; i++) 
        fast = fast.next; //giving n times headstart to fast
        if (fast == null) 
        return head.next;
        while (fast.next != null) {
        fast = fast.next;//when fast.next is null than slow is at node prev to the one to be deleted
            slow = slow.next;// unitil  then both increase by one each time.
        }
        slow.next = slow.next.next;//1->2->3 == 1->3
        return head;
    }
}