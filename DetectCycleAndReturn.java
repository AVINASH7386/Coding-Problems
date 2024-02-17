/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if( head == null )
        {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while( fast != null && fast.next != null )
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
            if( slow == fast )
            {
                slow = head;
                while( fast != slow )
                {
                    prev = fast;
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
                // fast.next = null;
                // prev.next = null;
                // break;
            }
        }
        return null;
    }
}