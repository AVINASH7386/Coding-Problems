/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    // int length1 = 0;
    // int length2 = 0;
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int length1 = length(headA);
        int length2 = length(headB);

        if( length1 > length2 )
        {
            return helper(headA,headB);
        }
        else
        {
           return helper(headB,headA);
        }
    }

    public  ListNode helper(ListNode list1, ListNode list2 )
    {
        if( list1 == list2 )
        {
            return list1;
        }

        int length1 = length(list1);
        int length2 = length(list2);

        int diff = length1 - length2;

        for( int i = 0; i < diff; i++)
        {
            list1 = list1.next;
        }

        while( true )
        {
            if( list1 == null || list2 == null )
            {
                return null;
            }
            if( list1 == list2 )
            {
                return list1;
            }
            list1 = list1.next;
            list2 = list2.next;
        }


    }

    public static int length( ListNode head )
    {
        int length = 0;

        while( head != null )
        {
            head= head.next;
            length++;
        }

        return length;
    }
}