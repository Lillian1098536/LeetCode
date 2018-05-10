package edu.university.leetcode.number.easy;

import edu.university.leetcode.list.easy.P234_PalindromeLinkedList;
import org.junit.Test;

import static edu.university.leetcode.list.medium.P2_AddTwoNumbers.ListNode;
import static org.junit.Assert.assertTrue;

public class P234_PalindromeLinkedListTest {
    @Test
    public void isPalindrome() throws Exception {
        ListNode test = new ListNode(1);
        test.next = new ListNode(2);
        test.next.next = new ListNode(3);
        test.next.next.next = new ListNode(2);
        test.next.next.next.next = new ListNode(1);
        assertTrue(P234_PalindromeLinkedList.isPalindrome(test));
    }

}