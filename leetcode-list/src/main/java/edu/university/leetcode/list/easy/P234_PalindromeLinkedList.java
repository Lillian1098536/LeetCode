package edu.university.leetcode.list.easy;

import edu.university.leetcode.list.ListNode;

/**
 * 234. Palindrome Linked List
 * Given a singly linked list, determine if it is a palindrome.
 * O(n) time and O(1) space
 */
public class P234_PalindromeLinkedList {

    public static boolean isPalindrome(ListNode head) {
        if (head == null && head.next == null) return true;
        ListNode tmpHead = head, rev = new ListNode(head.val);
        while (tmpHead.next != null) {
            tmpHead = tmpHead.next;
            ListNode tmp = new ListNode(tmpHead.val);
            tmp.next = rev;
            rev = tmp;
        }
        if (head.val != rev.val) return false;
        while (head.next != null) {
            head = head.next;
            rev = rev.next;
            if (head.val != rev.val) return false;
        }
        return true;
    }

}
