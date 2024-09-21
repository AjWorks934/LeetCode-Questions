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
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null) {
            fast = fast.next;//fast move 1
            if (fast != null) {
                fast = fast.next;//fast move 2
            }
            slow = slow.next;//slow move 1
        }
        return slow;
    }
}