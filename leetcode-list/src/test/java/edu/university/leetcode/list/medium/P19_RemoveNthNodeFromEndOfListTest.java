package edu.university.leetcode.list.medium;

import static edu.university.leetcode.list.medium.P2_AddTwoNumbers.ListNode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P19_RemoveNthNodeFromEndOfListTest {
    @Test
    public void removeNthFromEnd() throws Exception {
        ListNode test = new ListNode(1);
        test.next = new ListNode(2);
        test.next.next = new ListNode(3);
        test.next.next.next = new ListNode(4);
        test.next.next.next.next = new ListNode(5);
        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(3);
        expected.next.next.next = new ListNode(5);
        ListNode result = P19_RemoveNthNodeFromEndOfList.removeNthFromEnd(test, 2);
        assertEquals(expected, result);
    }

}