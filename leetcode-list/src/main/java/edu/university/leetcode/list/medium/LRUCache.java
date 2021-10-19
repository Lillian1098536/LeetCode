package edu.university.leetcode.list.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * 146. LRU Cache
 * Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
 * Implement the LRUCache class:
 * LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
 * int get(int key) Return the value of the key if the key exists, otherwise return -1.
 * void put(int key, int value) Update the value of the key if the key exists.
 * Otherwise, add the key-value pair to the cache.
 * If the number of keys exceeds the capacity from this operation, evict the least recently used key.
 * The functions get and put must each run in O(1) average time complexity.
 * Example 1: Input
 * ["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
 * [[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
 * Output [null, null, null, 1, null, -1, null, -1, 3, 4]
 * Explanation
 * LRUCache lRUCache = new LRUCache(2);
 * lRUCache.put(1, 1); // cache is {1=1}
 * lRUCache.put(2, 2); // cache is {1=1, 2=2}
 * lRUCache.get(1);    // return 1
 * lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
 * lRUCache.get(2);    // returns -1 (not found)
 * lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
 * lRUCache.get(1);    // return -1 (not found)
 * lRUCache.get(3);    // return 3
 * lRUCache.get(4);    // return 4
 * Constraints:
 * 1 <= capacity <= 3000
 * 0 <= key <= 104
 * 0 <= value <= 105
 * At most 2 * 105 calls will be made to get and put.
 */
public class LRUCache {

    class Node {
        int key;
        int value;
        Node prev;
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{key=" + key + ", value=" + value + '}';
        }
    }

    final int capacity;
    Map<Integer, Node> lookUp;
    DoubleList list;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.lookUp = new HashMap<>();
        this.list = new DoubleList();
    }

    public int get(int key) {
        if (!lookUp.containsKey(key)) {
            return -1;
        }
        Node node = lookUp.get(key);
        list.remove(node);
        list.addHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (lookUp.containsKey(key)) {
            Node node = lookUp.get(key);
            node.value = value;
            list.remove(node);
            list.addHead(node);
        } else {
            if (lookUp.size() >= capacity) {
                Node node = list.removeTail();
                lookUp.remove(node.key);
            }
            Node node = new Node(key, value);
            lookUp.put(key, node);
            list.addHead(node);
        }
    }

    public void printNode() {
        lookUp.entrySet().forEach(l -> {
            System.out.println("lookUp >>> " + l.getKey() + l.getValue().toString());
        });
        System.out.println("DoubleLinkedList >>> head=" + list.head.next.toString() + " tail=" + list.tail.toString());
    }

    public class DoubleList {
        Node head;
        Node tail;

        public DoubleList() {
            this.head = new Node(Integer.MIN_VALUE, -1);
            this.tail = this.head;
        }

        public Node getHead() {
            return head.next;
        }

        public void addHead(Node node) {
            if (head == tail) {
                head.next = node;
                node.prev = head;
                tail = node;
            } else {
                Node tmp = head.next;
                head.next = node;
                node.prev = head;
                node.next = tmp;
                tmp.prev = node;
            }
        }

        public Node removeTail() {
            if (head == tail) {
                return null;
            }
            tail.prev.next = null;
            Node remove = tail;
            tail = tail.prev;
            remove.prev = null;
            return remove;
        }

        public void remove(Node node) {
            if (node == tail) {
                removeTail();
            } else {
                Node tmp = node.next;
                node.prev.next = tmp;
                if (tmp != null) {
                    tmp.prev = node.prev;
                }
                node.prev = null;
                node.next = null;
            }
        }
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        System.out.println("should get -1 >>> " + lruCache.get(1));
        lruCache.put(1, 1); //1
        lruCache.put(2, 2); //2 1
        lruCache.printNode();
        System.out.println("should get 1  >>> " + lruCache.get(1)); // 1 2
        lruCache.printNode();
        lruCache.put(3, 3); // 3 1
        lruCache.printNode();
        System.out.println("should get 2  >>> " + lruCache.get(2)); // 3 1
        lruCache.put(4, 4); // 4 3
        lruCache.printNode();
        System.out.println("should get -1 >>> " + lruCache.get(1));// 4 3
        System.out.println("should get 3  >>> " + lruCache.get(3)); // 3 4
        lruCache.printNode();
        System.out.println("should get 4  >>> " + lruCache.get(4)); // 4 3
        lruCache.printNode();
    }
}