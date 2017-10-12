package edu.university.leetcode.number;

import edu.university.leetcode.number.P2_AddTwoNumbers;
import edu.university.leetcode.number.P2_AddTwoNumbers.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class P2_AddTwoNumbersTest {
    @Test
    public void addTwoNumbers() throws Exception {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode expected = new ListNode(7);
        expected.next = new ListNode(0);
        expected.next.next = new ListNode(8);

        ListNode result = P2_AddTwoNumbers.addTwoNumbers(l1, l2);
        assertEquals(expected, result);
    }

}