package edu.university.leetcode.number.easy;

import static edu.university.leetcode.list.medium.P2_AddTwoNumbers.ListNode;

/**
 * 234. Palindrome Linked List
 * Given a singly linked list, determine if it is a palindrome.
 * O(n) time and O(1) space
 */
public class P234_PalindromeLinkedList {

    public static boolean isPalindrome(ListNode head) {
        if (head == null && head.next == null) return true;
        ListNode tmpHead = head, reverse = new ListNode(head.val);
        while (tmpHead.next != null) {
            tmpHead = tmpHead.next;
            ListNode tmp = new ListNode(tmpHead.val);
            tmp.next = reverse;
            reverse = tmp;
        }
        if (head.val != reverse.val) return false;
        while (head.next != null) {
            head = head.next;
            reverse = reverse.next;
            if (head.val != reverse.val) return false;
        }
        return true;
    }

}
