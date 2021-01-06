package edu.university.leetcode.list.hard;

import java.util.PriorityQueue;

/**
 * 23. Merge k Sorted Lists
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 * Example: Input:
 * [
 * 1->4->5,
 * 1->3->4,
 * 2->6
 * ]
 * Output: 1->1->2->3->4->4->5->6
 */
public class P23_MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        if (lists.length == 1) return lists[0];

        PriorityQueue<ListNode> pq = new PriorityQueue<>();
        ListNode head = new ListNode(0);
        ListNode pre = head;
        for (ListNode list : lists) {
            if (list != null) pq.offer(list);
        }
        while (!pq.isEmpty()) {
            ListNode tmp = pq.poll();
            pre.next = tmp;
            pre = pre.next;
            if (tmp.next != null) pq.offer(tmp.next);
        }
        return head.next;
    }

    public static class ListNode implements Comparable<ListNode> {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

        @Override
        public int compareTo(ListNode o) {
            return this.val - o.val;
        }
    }
}
