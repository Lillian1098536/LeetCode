package edu.university.leetcode.list.easy;

import edu.university.leetcode.list.ListNode;

import java.util.HashSet;

/**
 * Given a linked node list, check if the linked node list has looped or not
 */
public class DetectLoop {

    static ListNode head;

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

    public static boolean detectLoop2(ListNode node) {
        ListNode slow = node.next == null ? null : node.next;
        assert node.next != null;
        ListNode fast = node.next.next == null ? null : node.next.next;
        while (slow != null && fast != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next == null ? null : slow.next;
            fast = fast.next.next == null ? null : fast.next.next;
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

        if (detectLoop2(head)) {
            System.out.println("2 Loop found");
        } else {
            System.out.println("2 No loop");
        }

        if (detectLoop(head)) {
            System.out.println("Loop found");
        } else {
            System.out.println("No loop");
        }
    }

}
