package edu.university.leetcode.list.hard;

/**
 * 25. Reverse Nodes in k-Group
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
 * k is a positive integer and is less than or equal to the length of the linked list.
 * If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.
 * Follow up:
 * Could you solve the problem in O(1) extra memory space?
 * You may not alter the values in the list's nodes, only nodes itself may be changed.
 * Example 1: Input: head = [1,2,3,4,5], k = 2 Output: [2,1,4,3,5]
 * Example 2: Input: head = [1,2,3,4,5], k = 3 Output: [3,2,1,4,5]
 * Example 3: Input: head = [1,2,3,4,5], k = 1 Output: [1,2,3,4,5]
 * Example 4: Input: head = [1], k = 1 Output: [1]
 * Constraints:
 * The number of nodes in the list is in the range sz.
 * 1 <= sz <= 5000
 * 0 <= Node.val <= 1000
 * 1 <= k <= sz
 */
public class P25_ReverseNodesInKGroup {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() { }
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy, p = head;
        int i = 0;
        while (p != null) {
            i++;
            if (i % k == 0) {
                pre = reverse(pre, p.next);
                p = pre.next;
            } else {
                p = p.next;
            }
        }
        return dummy.next;
    }
    private static ListNode reverse(ListNode pre, ListNode n) {
        ListNode reverse = pre.next, tmp = reverse.next;
        System.out.println("pre = " + printString(pre));
        System.out.println("reverse = " + printString(reverse));
        System.out.println("tmp = " + printString(tmp));
        while (tmp != n) {
            reverse.next = tmp.next;
            tmp.next = pre.next;
            pre.next = tmp;
            tmp = reverse.next;
        }
        System.out.println("after pre = " + printString(pre));
        System.out.println("after reverse = " + printString(reverse));
        System.out.println("after tmp = " + printString(tmp) + "\n");
        return reverse;
    }
    private static ListNode reverse(ListNode head){
        ListNode reversedHead = null;
        while(head != null){
            ListNode tmp = head.next;
            head.next = reversedHead;
            reversedHead = head;
            head = tmp;
        }
        return reversedHead;
    }
    public static String printString(ListNode head) {
        ListNode p = head;
        StringBuilder sb = new StringBuilder();
        while (p != null) {
            sb.append(p.val);
            if (p.next != null) {
                sb.append("->");
            } else {
                sb.append("->null");
            }
            p = p.next;
        }
        return sb.toString();
    }
}
