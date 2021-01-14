package edu.university.leetcode.list.easy;

import java.util.HashSet;

/**
 * Given a linked node list, check if the linked node list has loop or not
 */
public class DetectLoop {

    static ListNode head;

    static class ListNode {

        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            next = null;
        }
    }

    public static void pushNode(int data) {
        ListNode node = new ListNode(data);
        node.next = head;
        head = node;
    }

    public static boolean detectLoop(ListNode node) {
        HashSet<ListNode> set = new HashSet<>();
        while (node != null) {
            if (set.contains(node)) {
                return true;
            }
            set.add(node);
            node = node.next;
        }
        return false;
    }

    public static void main (String[] args) {
        DetectLoop loop = new DetectLoop();
        loop.pushNode(20);
        loop.pushNode(4);
        loop.pushNode(15);
        loop.pushNode(10);
        loop.head.next.next.next.next = loop.head;

        if (detectLoop(head)) {
            System.out.println("Loop found");
        } else {
            System.out.println("No loop");
        }
    }

}
