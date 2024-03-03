package edu.university.leetcode.list.medium;

import edu.university.leetcode.list.ListNode;
/**
 * 142. Linked List Cycle II
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 */
public class P142_LinkedListCycleII {

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                ListNode tmp = head;
                while(tmp != slow){
                    tmp = tmp.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }

}
