package edu.university.leetcode.list.easy;

import static edu.university.leetcode.list.medium.P2_AddTwoNumbers.ListNode;

import edu.university.leetcode.list.easy.P83_RemoveDuplicatesFromSortedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class P83_RemoveDuplicatesFromSortedListTest {

    @Test
    public void deleteDuplicates1() throws Exception {
        ListNode head = new ListNode(0);
        ListNode result = P83_RemoveDuplicatesFromSortedList.deleteDuplicates(head);
        assertEquals(null, result.next);

    }

    @Test
    public void deleteDuplicates2() throws Exception {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        ListNode result = P83_RemoveDuplicatesFromSortedList.deleteDuplicates(head);
        assertEquals(expected, result);
    }

    @Test
    public void deleteDuplicates3() throws Exception {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        ListNode result = P83_RemoveDuplicatesFromSortedList.deleteDuplicates(head);
        assertEquals(expected, result);
    }

    @Test
    public void deleteDuplicates4() throws Exception {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(3);
        ListNode result = P83_RemoveDuplicatesFromSortedList.deleteDuplicates(head);
        assertEquals(expected, result);
    }

}