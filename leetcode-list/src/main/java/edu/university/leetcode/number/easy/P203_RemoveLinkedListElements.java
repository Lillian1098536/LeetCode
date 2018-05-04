package edu.university.leetcode.number.easy;

import static edu.university.leetcode.list.medium.P2_AddTwoNumbers.ListNode;

/**
 * 203. Remove Linked List Elements
 * Remove all elements from a linked list of integers that have value val.
 * Example:
 * Input:  1->2->6->3->4->5->6, val = 6
 * Output: 1->2->3->4->5
 */
public class P203_RemoveLinkedListElements {

    public ListNode removeElementsNew(ListNode head, int val) {
        ListNode result = new ListNode(0);
        ListNode tmp = result;
        while (head != null) {
            if (head.val != val) {
                tmp.next = new ListNode(head.val);
                tmp = tmp.next;
            }
            head = head.next == null ? null : head.next;
        }
        return result.next;
    }

    /**
     * use tmp to move forward list pointer
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode tmp = result;
        while (tmp.next != null) {
            if (tmp.next.val == val) {
                tmp.next = tmp.next.next;
            } else {
                tmp = tmp.next;
            }
        }
        return result.next;
    }

}
