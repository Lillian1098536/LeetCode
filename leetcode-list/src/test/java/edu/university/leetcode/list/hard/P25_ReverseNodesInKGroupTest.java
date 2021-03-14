package edu.university.leetcode.list.hard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static edu.university.leetcode.list.hard.P25_ReverseNodesInKGroup.ListNode;

public class P25_ReverseNodesInKGroupTest {
    P25_ReverseNodesInKGroup test = new P25_ReverseNodesInKGroup();
    @Test
    public void reverseKGroup() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode expected = new ListNode(2);
        expected.next = new ListNode(1);
        expected.next.next = new ListNode(4);
        expected.next.next.next = new ListNode(3);
        expected.next.next.next.next = new ListNode(5);
        assertEquals(expected, test.reverseKGroup(head, 2));
    }
}