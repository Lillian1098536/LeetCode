package edu.university.leetcode.list.medium;

import edu.university.leetcode.list.ListNode;

/**
 * 19. Remove Nth Node From End of List
 * Given a linked list, remove the n-th node from the end of list and return its head.
 * Example: Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 */
public class P19_RemoveNthNodeFromEndOfList {

    /**
     * Hint: Maintain two pointers and update one with a delay of n steps
     * double pointer
     * @param head
     * @param n
     * @return
     */
    public static ListNode removeNthFromEndDoublePointer(ListNode head, int n) {
        if (head == null || head.next == null) return null;
        ListNode slow = head, fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            head = head.next;
            return head;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) return null;
        int size = 0;
        ListNode node = head;
        while (node != null) {
            node = node.next;
            size++;
        }
        if (n == size) {
            head = head.next; //delete the first node
            return head;
        }
        int p = size - n;
        ListNode tmp = head;
        for (int i = 0; i < p - 1; i++) {
            tmp = tmp.next;
        }
        tmp.next = tmp.next.next; //remove the node in front of tmp
        return head;
    }

}