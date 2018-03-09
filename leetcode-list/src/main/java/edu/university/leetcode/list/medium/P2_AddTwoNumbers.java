package edu.university.leetcode.list.medium;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

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
@Slf4j
public class P2_AddTwoNumbers {

    /**
     * @param l1
     * @param l2
     * @return sum
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); //dummyHead as a pointer
        ListNode head = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            ListNode tmp = new ListNode(0);
            int sum = ((l2 == null) ? 0 : l2.val) + ((l1 == null) ? 0 : l1.val) + carry;
            tmp.val = sum % 10;           //pass sum to tmp
            carry = sum / 10;
            dummyHead.next = tmp;           //pass tmp to prev
            log.debug("dummyHead={} dummyHead.next={}", dummyHead, dummyHead.next);
            dummyHead = tmp;                //move pointer forward
            log.debug("after dummyHead={}", dummyHead);
            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
            log.debug("head={}", head);
        }
        log.debug("head={}", head);
        return head.next;
    }

    @Data
    public static class ListNode {

        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

}
