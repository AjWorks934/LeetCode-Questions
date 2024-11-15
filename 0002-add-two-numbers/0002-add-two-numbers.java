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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    { 
        return Helper(l1, l2, 0); 
    } 
    public ListNode Helper(ListNode l1, ListNode l2, int cr) 
    { 
        if (l1 == null && l2 == null && cr == 0) 
        { 
            return null; 
        } 
        int val1 = (l1 != null) ? l1.val : 0; 
        int val2 = (l2 != null) ? l2.val : 0; 
        int sum = val1 + val2 + cr; 
        ListNode result = new ListNode(sum % 10); 
        result.next = Helper((l1 != null) ? l1.next : null, (l2 != null) ? l2.next : null, sum / 10); 
        return result; 
    } 
}