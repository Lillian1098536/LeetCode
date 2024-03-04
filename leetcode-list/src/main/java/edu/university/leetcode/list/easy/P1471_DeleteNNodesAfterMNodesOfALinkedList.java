package edu.university.leetcode.list.easy;

import edu.university.leetcode.list.ListNode;

import static edu.university.leetcode.list.ListNode.*;

/**
 * 1474. Delete N Nodes After M Nodes of a Linked List
 * Given a linked list and two integers M and N. Traverse the linked list such that you retain M nodes then delete next N nodes,
 * continue the same till end of the linked list.
 * Difficulty Level: Rookie
 * Example 1: Input: M = 2, N = 2
 * Linked List: 1->2->3->4->5->6->7->8
 * Output: Linked List: 1->2->5->6
 * Example 2: Input: M = 3, N = 2
 * Linked List: 1->2->3->4->5->6->7->8->9->10
 * Output: Linked List: 1->2->3->6->7->8
 * Example 3: Input: M = 1, N = 1
 * Linked List: 1->2->3->4->5->6->7->8->9->10
 * Output: Linked List: 1->3->5->7->9
 */
public class P1471_DeleteNNodesAfterMNodesOfALinkedList {

    public void linkDelete(ListNode head, int m, int n) {
        ListNode cur = head, p;
        int cnt;
        while (cur != null) {
            for (cnt = 1; cnt < m && cur != null; cnt++) {
                cur = cur.next;
            }
            if (cur == null) {
                return;
            }
            p = cur.next;
            for (cnt = 1; cnt <= n && p != null; cnt++) {
                p = p.next;
            }
            cur.next = p;
            cur = p;
        }
    }

    public static void main(String[] args) {
        P1471_DeleteNNodesAfterMNodesOfALinkedList test = new P1471_DeleteNNodesAfterMNodesOfALinkedList();
        ListNode head = new ListNode(1);
        insertEnd(head, 2);
        insertEnd(head, 3);
        insertEnd(head, 4);
        insertEnd(head, 5);
        insertEnd(head, 6);
        insertEnd(head, 7);
        insertEnd(head, 8);
        insertEnd(head, 9);
        insertEnd(head, 10);
        int m = 3, n = 2;
        System.out.println("M=" + m + " N=" + n +  " Given ListNode\n" + printListNode(head));
        test.linkDelete(head, m, n);
        System.out.println("After deletion\n" + printListNode(head));
    }

}
