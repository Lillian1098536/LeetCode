package edu.university.leetcode.list.easy;

import edu.university.leetcode.list.ListNode;

import lombok.extern.slf4j.Slf4j;

/**
 * P. 21 Merge Two Sorted Lists
 * The key to solve the problem is defining a fake head. Then compare the first elements from each list.
 * Add the smaller one to the merged list. Finally, when one of them is empty, simply append it to the merged list,
 * since it is already sorted.
 */
@Slf4j
public class P21_MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        log.debug("l1={} l2={}", l1, l2);
        ListNode head = new ListNode(0);
        ListNode tmp = head;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    tmp.next = l1;
                    l1 = l1.next;
                } else {
                    tmp.next = l2;
                    l2 = l2.next;
                }
                tmp = tmp.next;
            } else if (l1 == null) {
                tmp.next = l2;
                break;
            } else if (l2 == null) {
                tmp.next = l1;
                break;
            }
            log.debug("tmp={} tmp.next={} head={}", tmp, tmp.next, head);
        }
        log.debug("head={}", head.next);
        return head.next;
    }

    public static ListNode mergeTwoSortedLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = mergeTwoSortedLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoSortedLists(l1, l2.next);
            return l2;
        }
    }

}
