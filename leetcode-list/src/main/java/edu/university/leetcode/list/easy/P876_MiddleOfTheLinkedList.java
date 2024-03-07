package edu.university.leetcode.list.easy;

import edu.university.leetcode.list.ListNode;

import static edu.university.leetcode.list.ListNode.*;

/**
 * 876. Middle of the Linked List
 * Given the head of a singly linked list, return the middle node of the linked list.
 * If there are two middle nodes, return the second middle node.
 * Example 1: Input: head = [1,2,3,4,5] Output: [3,4,5]
 * Explanation: The middle node of the list is node 3.
 * Example 2: Input: head = [1,2,3,4,5,6] Output: [4,5,6]
 * Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 * Constraints:
 * The number of nodes in the list is in the range [1, 100].
 * 1 <= Node.val <= 100
 */
public class P876_MiddleOfTheLinkedList {
    /**
     * double pointer
     * @param head
     * @return
     */
    public ListNode middleNode(ListNode head) {
        if (head == null) return null;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode middleNodeSize(ListNode head) {
        int size = 0;
        ListNode tmp = head;
        while (tmp != null) {
            tmp = tmp.next;
            size++;
        }
        tmp = head;
        for (int i = 0; i < size / 2; i++) {
            tmp = tmp.next;
        }
        return tmp;
    }

    public static void main(String[] args) {
        P876_MiddleOfTheLinkedList test = new P876_MiddleOfTheLinkedList();
        ListNode head = new ListNode(1);
        insertEnd(head, 2);
        insertEnd(head, 3);
        insertEnd(head, 4);
        insertEnd(head, 5);
        System.out.println(printNode(test.middleNode(head)));
        System.out.println(printNode(test.middleNodeSize(head)));
    }
}
