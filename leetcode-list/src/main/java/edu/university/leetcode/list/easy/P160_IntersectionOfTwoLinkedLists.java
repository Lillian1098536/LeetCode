package edu.university.leetcode.list.easy;

import static edu.university.leetcode.list.medium.P2_AddTwoNumbers.ListNode;

/**
 * 160. Intersection of Two Linked Lists
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 * For example, the following two linked lists:
 * A:          a1 → a2
 *                     ↘
 *                      c1 → c2 → c3
 *                     ↗
 * B:     b1 → b2 → b3
 * begin to intersect at node c1.
 * Notes:
 * If the two linked lists have no intersection at all, return null.
 * The linked lists must retain their original structure after the function returns.
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Your code should preferably run in O(n) time and use only O(1) memory.
 */
public class P160_IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        int countA = 0, countB = 0, diff;
        ListNode tmp = headA, fast, slow;
        while (tmp != null) {
            tmp = tmp.next;
            countA++;
        }
        tmp = headB;
        while (tmp != null) {
            tmp = tmp.next;
            countB++;
        }
        if (countA > countB) {
            diff = countA - countB;
            fast = headA;
            slow = headB;
        } else {
            diff = countB - countA;
            fast = headB;
            slow = headA;
        }
        while (diff > 0) {
            fast = fast.next;
            diff--;
        }
        while (fast != null && slow != null) {
            if (fast != slow) {
                fast = fast.next;
                slow = slow.next;
            } else {
                return fast;
            }
        }
        return null;
    }
}
