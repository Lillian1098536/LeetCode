package edu.university.leetcode.list.hard;

import java.util.HashMap;
import java.util.Map;

/**
 * 460. LFU Cache
 * Design and implement a data structure for a Least Frequently Used (LFU) cache.
 * Implement the LFUCache class:
 * LFUCache(int capacity) Initializes the object with the capacity of the data structure.
 * int get(int key) Gets the value of the key if the key exists in the cache. Otherwise, returns -1.
 * void put(int key, int value) Update the value of the key if present, or inserts the key if not already present.
 * When the cache reaches its capacity, it should invalidate and remove the least frequently used key before inserting a new item.
 * For this problem, when there is a tie (i.e., two or more keys with the same frequency), the least recently used key would be invalidated.
 * To determine the least frequently used key, a use counter is maintained for each key in the cache.
 * The key with the smallest use counter is the least frequently used key.
 * When a key is first inserted into the cache, its use counter is set to 1 (due to the put operation).
 * The use counter for a key in the cache is incremented either a get or put operation is called on it.
 * The functions get and put must each run in O(1) average time complexity.
 * Example 1: Input
 * ["LFUCache", "put", "put", "get", "put", "get", "get", "put", "get", "get", "get"]
 * [[2], [1, 1], [2, 2], [1], [3, 3], [2], [3], [4, 4], [1], [3], [4]]
 * Output [null, null, null, 1, null, -1, 3, null, -1, 3, 4]
 * Explanation
 * // cnt(x) = the use counter for key x
 * // cache=[] will show the last used order for tiebreakers (leftmost element is  most recent)
 * LFUCache lfu = new LFUCache(2);
 * lfu.put(1, 1);   // cache=[1,_], cnt(1)=1
 * lfu.put(2, 2);   // cache=[2,1], cnt(2)=1, cnt(1)=1
 * lfu.get(1);      // return 1
 * // cache=[1,2], cnt(2)=1, cnt(1)=2
 * lfu.put(3, 3);   // 2 is the LFU key because cnt(2)=1 is the smallest, invalidate 2.
 * // cache=[3,1], cnt(3)=1, cnt(1)=2
 * lfu.get(2);      // return -1 (not found)
 * lfu.get(3);      // return 3
 * // cache=[3,1], cnt(3)=2, cnt(1)=2
 * lfu.put(4, 4);   // Both 1 and 3 have the same cnt, but 1 is LRU, invalidate 1.
 * // cache=[4,3], cnt(4)=1, cnt(3)=2
 * lfu.get(1);      // return -1 (not found)
 * lfu.get(3);      // return 3
 * // cache=[3,4], cnt(4)=1, cnt(3)=3
 * lfu.get(4);      // return 4
 * // cache=[4,3], cnt(4)=2, cnt(3)=3
 * Constraints:
 * 0 <= capacity <= 104
 * 0 <= key <= 105
 * 0 <= value <= 109
 * At most 2 * 105 calls will be made to get and put.
 */
public class P460_LFUCache {
    //Map<key, Node<key, value, freq>>
    private Map<Integer, Node> cache;
    private DoubleLinkedList firstDll;
    private DoubleLinkedList lastDll;
    private int size;
    private int capacity;
    public P460_LFUCache(int capacity) {
        cache = new HashMap<>(capacity);
        firstDll = new DoubleLinkedList();
        lastDll = new DoubleLinkedList();
        firstDll.next = lastDll;
        lastDll.pre = firstDll;
        this.capacity = capacity;
    }

    public int get(int key) {
        Node node = cache.get(key);
        if (node == null) { return -1; }
        freqIncrease(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (capacity == 0) {
            return;
        }
        Node node = cache.get(key);
        if (node != null) {
            node.value = value;
            freqIncrease(node);
        } else {
            if (size == capacity) {
                cache.remove(lastDll.pre.tail.pre.key);
                lastDll.removeNode(lastDll.pre.tail.pre);
                size--;
                if (lastDll.pre.head.next == lastDll.pre.tail) {
                    removeDoubleLinkedList(lastDll.pre);
                }
            }
            Node newNode = new Node(key, value);
            cache.put(key, new Node());
            if (lastDll.pre.freq != 1) {
                DoubleLinkedList newDll = new DoubleLinkedList(1);
                addDoubleLinkedList(newDll, lastDll.pre);
                newDll.addNode(newNode);
            } else {
                lastDll.pre.addNode(newNode);
            }
            size++;
        }
    }

    public void freqIncrease(Node node) {
        DoubleLinkedList dll = node.doubleLinkedList;
        DoubleLinkedList preDll = dll.pre;
        dll.removeNode(node);
        if (dll.head.next == dll.tail) {
            removeDoubleLinkedList(dll);
        }

        node.freq++;
        if (preDll.freq != node.freq) {
            DoubleLinkedList newDll = new DoubleLinkedList(node.freq);
            addDoubleLinkedList(newDll, preDll);
            newDll.addNode(node);
        } else {
            preDll.addNode(node);
        }
    }

    public void addDoubleLinkedList(DoubleLinkedList newDll, DoubleLinkedList preDll) {
        newDll.next = preDll.next;
        newDll.next.pre = newDll;
        newDll.pre = preDll;
        preDll.next = newDll;
    }

    public void removeDoubleLinkedList(DoubleLinkedList dll) {
        dll.pre.next = dll.next;
        dll.next.pre = dll.pre;
    }

    class Node {
        int key;
        int value;
        int freq = 1;
        Node pre;
        Node next;
        DoubleLinkedList doubleLinkedList;
        public Node() {}
        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    class DoubleLinkedList {
        int freq;
        DoubleLinkedList pre;
        DoubleLinkedList next;
        Node head;
        Node tail;
        public DoubleLinkedList() {
            head = new Node();
            tail = new Node();
            head.next = tail;
            tail.pre = head;
        }
        public DoubleLinkedList(int freq) {
            head = new Node();
            tail = new Node();
            head.next = tail;
            tail.pre = head;
            this.freq = freq;
        }
        void removeNode(Node node) {
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }

        void addNode(Node node) {
            node.next = head.next;
            head.next.pre = node;
            head.next = node;
            node.pre = head;
            node.doubleLinkedList = this;
        }
    }
}
