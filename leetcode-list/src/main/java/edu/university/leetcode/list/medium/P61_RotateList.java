package edu.university.leetcode.list.medium;

import edu.university.leetcode.list.ListNode;

/**
 * 61. Rotate List
 * Given the head of a linked list, rotate the list to the right by k places.
 * Example 1: Input: head = [1,2,3,4,5], k = 2 Output: [4,5,1,2,3]
 * Example 2: Input: head = [0,1,2], k = 4 Output: [2,0,1]
 * Constraints: The number of nodes in the list is in the range [0, 500].
 * -100 <= Node.val <= 100
 * 0 <= k <= 2 * 109
 */
public class P61_RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) return head;
        int n = 0;
        ListNode tail = null;
        for (ListNode p = head; p != null; p = p.next) {
            tail = p;
            n++;
        }
        k = k % n;
        ListNode p = head;
        for (int i = 0; i < n - k - 1; i++) {
            p = p.next;
        }
        tail.next = head;
        head = p.next;
        p.next = null;
        return head;
    }
}
