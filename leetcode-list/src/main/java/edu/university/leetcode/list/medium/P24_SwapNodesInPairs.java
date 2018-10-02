package edu.university.leetcode.list.medium;

import lombok.val;

import static edu.university.leetcode.list.medium.P2_AddTwoNumbers.ListNode;
/**
 * 24. Swap Nodes in Pairs
 * Given a linked list, swap every two adjacent nodes and return its head.
 * Example: Given 1->2->3->4, you should return the list as 2->1->4->3.
 * Note:
 * Your algorithm should use only constant extra space.
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 */
public class P24_SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode result = new ListNode(0);
        while (head != null) {
            int tmp = head.val;
            if (head.next != null) {
                head.val = head.next.val;
                head.next.val = tmp;
                head = head.next.next;
            } else {
                head = head.next;
            }
        }
        return result.next;
    }

}
