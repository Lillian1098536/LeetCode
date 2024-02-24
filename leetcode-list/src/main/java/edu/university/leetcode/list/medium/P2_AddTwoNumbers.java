package edu.university.leetcode.list.medium;

import edu.university.leetcode.list.ListNode;

/**
 * 2. Add Two Numbers
 * Given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 *
 * Complexity Analysis
 * Time complexity : O(max(m, n)). Assume that mm and nn represents the length of l1 and l2 respectively,
 * the algorithm above iterates at most max(m, n) times.
 * Space complexity : OO(max(m,n)). The length of the new list is at most max(m,n) + 1.
 */
public class P2_AddTwoNumbers {

    /**
     * @param l1
     * @param l2
     * @return sum
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0), dummy = head;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = ((l2 == null) ? 0 : l2.val) + ((l1 == null) ? 0 : l1.val) + carry;
            ListNode tmp = new ListNode(sum % 10);
            carry = sum / 10;
            dummy.next = tmp;
            dummy = dummy.next;
            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        return head.next;
    }

}
