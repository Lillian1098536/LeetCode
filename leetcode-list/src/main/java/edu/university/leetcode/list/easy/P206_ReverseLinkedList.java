package edu.university.leetcode.list.easy;

import edu.university.leetcode.list.ListNode;

/**
 * 206. Reverse Linked List
 * Reverse a singly linked list.
 * Example:
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * Follow up: A linked list can be reversed either iteratively or recursively.
 */
public class P206_ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode node = null;
        while (head != null) {
            ListNode tmp = head.next;
            head.next = node;
            node = head;
            head = tmp;
        }
        return node;
    }

}
