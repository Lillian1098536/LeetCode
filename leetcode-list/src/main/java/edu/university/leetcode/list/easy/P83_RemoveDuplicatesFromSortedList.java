package edu.university.leetcode.list.easy;

import lombok.extern.slf4j.Slf4j;

import static edu.university.leetcode.list.medium.P2_AddTwoNumbers.ListNode;

/**
 * 83. Remove Duplicates from Sorted List
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * Example, Given 1->1->2, return 1->2. Given 1->1->2->3->3, return 1->2->3.
 */
@Slf4j
public class P83_RemoveDuplicatesFromSortedList {

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode node = head;
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                // move forward pointer
                node = node.next;
            }
            log.debug("node={} head={}", node, head);
        }
        return head;
    }

}
