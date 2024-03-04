package edu.university.leetcode.list.medium;

import edu.university.leetcode.list.ListNode;

/**
 * 1721. Swapping Nodes in a Linked List
 * You are given the head of a linked list, and an integer k.
 * Return the head of the linked list after swapping the values of the kth node from the beginning
 * and the kth node from the end (the list is 1-indexed).
 * Example 1: Input: head = [1,2,3,4,5], k = 2 Output: [1,4,3,2,5]
 * Example 2: Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5 Output: [7,9,6,6,8,7,3,0,9,5]
 * Constraints:
 * The number of nodes in the list is n.
 * 1 <= k <= n <= 105
 * 0 <= Node.val <= 100
 */
public class P1721_SwappingNodesInALinkedList {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode cur = head;
        for (int i = 0; i < k - 1; i++) {
            cur = cur.next;
        }
        ListNode frontKNode = cur, backKNode = head;
        while (cur.next != null) {
            cur = cur.next;
            backKNode = backKNode.next;
        }
        int tmp = frontKNode.val;
        frontKNode.val = backKNode.val;
        backKNode.val = tmp;
        return head;
    }
}
