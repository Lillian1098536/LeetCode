package edu.university.leetcode.list.easy;

import static edu.university.leetcode.list.medium.P2_AddTwoNumbers.ListNode;
import static org.junit.Assert.assertEquals;

import edu.university.leetcode.list.easy.P21_MergeTwoSortedLists;
import org.junit.Test;

public class P21_MergeTwoSortedListsTest {

    @Test
    public void mergeTwoLists1() throws Exception {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(8);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(5);
        l2.next.next = new ListNode(7);
        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(4);
        expected.next.next.next = new ListNode(5);
        expected.next.next.next.next = new ListNode(7);
        expected.next.next.next.next.next = new ListNode(8);
        ListNode result = P21_MergeTwoSortedLists.mergeTwoLists(l1, l2);
        assertEquals(expected, result);
    }

    @Test
    public void mergeTwoLists2() throws Exception {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(8);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(5);
        l2.next.next = new ListNode(7);
        ListNode expected = new ListNode(1);
        expected.next = new ListNode(2);
        expected.next.next = new ListNode(4);
        expected.next.next.next = new ListNode(5);
        expected.next.next.next.next = new ListNode(7);
        expected.next.next.next.next.next = new ListNode(8);
        ListNode result = P21_MergeTwoSortedLists.mergeTwoSortedLists(l1, l2);
        assertEquals(expected, result);
    }

}