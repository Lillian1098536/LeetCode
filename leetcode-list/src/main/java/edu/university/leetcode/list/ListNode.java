package edu.university.leetcode.list;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() { }
    public ListNode(int val) {
        this.val = val;
        next = null;
    }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }


    public static ListNode insertBegin(ListNode root, int val) {
        ListNode head = new ListNode(val);
        head.next = root;
        return head;
    }

    public static ListNode insertEnd(ListNode root, int val) {
        ListNode head = root;
        while (head.next != null) {
            head = head.next;
        }
        head.next = new ListNode(val);
        return root;
    }
    public static ListNode insertBefore(ListNode root, int val, int target) {
        ListNode head = root;
        while (head.next != null) {
            if (target == head.next.val) {
                ListNode tmp = head.next;
                head.next = new ListNode(val);
                head = head.next;
                head.next = tmp;
            }
            head = head.next;
        }
        return root;
    }

    public static ListNode insertAfter(ListNode root, int val, int target) {
        ListNode head = root;
        while (head != null) {
            if (target == head.val) {
                ListNode tmp = head.next;
                head.next = new ListNode(val);
                head = head.next;
                head.next = tmp;
            }
            head = head.next;
        }
        return root;
    }

    public static ListNode insertPosition(ListNode root, int val, int k) {
        ListNode head = root;
        int i = 1;
        while (head != null) {
            if (k == 1) {
                return insertBegin(root, val);
            } else if (head.next == null && k == i) {
                return insertEnd(root, val);
            } else if (k == i + 1) {
                ListNode tmp = head.next;
                head.next = new ListNode(val);
                head = head.next;
                head.next = tmp;
                return root;
            }
            head = head.next;
            i++;
        }
        return root;
    }

    public static ListNode deleteNode(ListNode root, int target) {
        ListNode head = root;
        while (head.next != null) {
            if (target == head.next.val) {
                if (head.next.next != null) {
                    head.next.val = head.next.next.val;
                    head.next.next = head.next.next.next;
                } else {
                    head.next = null;
                    return root;
                }
            }
            head = head.next;
        }
        return root;
    }

    public static ListNode reverse(ListNode root) {
        ListNode reverse = null;
        while (root != null) {
            ListNode tmp = root.next;
            root.next = reverse;
            reverse = root;
            root = tmp;
        }
        return reverse;
    }

    public static ListNode bubbleSort(ListNode root) {
        if (root == null) return null;
        ListNode head = root, next;
        while (head != null) {
            next = head.next;
            while (next != null) {
                if (head.val > next.val) {
                    swap(head, next);
                }
                next = next.next;
            }
            head = head.next;
        }
        return root;
    }

    public static void swap(ListNode p, ListNode q) {
        if (p != q) {
            int tmp = p.val;
            p.val = q.val;
            q.val = tmp;
        }
    }

    public static ListNode mergeSorted(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0), tmp = head;
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

        }
        return head.next;
    }

    public class StackByListNode {
        ListNode stack;
        StackByListNode() { this.stack = null; }
        public void push(int val) {
            ListNode tmp = new ListNode();
            tmp.val = val;
            tmp.next = stack;
            stack = tmp;
        }
        public boolean isEmpty() { return stack == null; }
        public int peek() {
            if (!isEmpty()) return stack.val;
            return -1;
        }
        public void pop() {
            if (stack == null) return;
            stack = stack.next;
        }
    }

    public class QueueByListNode {
        ListNode front;
        ListNode rear;
        QueueByListNode() { this.front = this.rear = null; }
        public void enQueue(int val) {
            ListNode tmp = new ListNode(val);
            if (this.rear == null) {
                this.front = this.rear = tmp;
                return;
            }
            this.rear.next = tmp;
            this.rear = this.rear.next;
        }
        public void deQueue() {
            if (this.front == null) return;
            ListNode tmp = this.front;
            this.front = this.front.next;
            if (this.front == null) this.rear = null;
        }
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        System.out.println("Insert in the beginning " + toString(insertBegin(root, 4)));
        System.out.println("Insert at the end " + toString(insertEnd(root, 5)));
        System.out.println("Insert before node " + toString(insertBefore(root, 6, 2)));
        System.out.println("Insert after node " + toString(insertAfter(root, 7, 2)));
        System.out.println("Insert at position " + toString(insertPosition(root, 8, 1)));
        System.out.println("Insert at position " + toString(insertPosition(root, 9, 2)));
        System.out.println("Insert at position " + toString(insertPosition(root, 10, 3)));
        System.out.println("Insert at position " + toString(insertPosition(root, 11, 9)));
        System.out.println("Insert at position " + toString(insertPosition(root, 12, 11)));
        System.out.println("Delete a node " + toString(deleteNode(root, 3)));
        System.out.println("Delete a node " + toString(deleteNode(root, 5)));
        System.out.println("Reverse a node " + toString(reverse(root)));
        ListNode head = new ListNode(1);
        head.next = new ListNode(6);
        head.next.next = new ListNode(5);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(7);
        System.out.println("Bubble sort " + toString(bubbleSort(head)));
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(8);
        System.out.println("Merge sorted lists" + toString(mergeSorted(head, l2)));

    }

    public static String toString(ListNode root) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (root != null) {
            sb.append(root.val);
            if (root.next != null) {
                sb.append(", ");
            }
            root = root.next;
        }
        sb.append("]");
        return sb.toString();
    }

}
