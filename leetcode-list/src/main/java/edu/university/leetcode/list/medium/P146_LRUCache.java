package edu.university.leetcode.list.medium;

import java.util.HashMap;
import java.util.Map;

class P146_LRUCache {

    int capacity;
    Map<Integer, Node> lookUp;
    final Node head = new Node();
    final Node tail = new Node();

    public P146_LRUCache(int capacity) {
        this.capacity = capacity;
        lookUp = new HashMap(capacity);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        int result = -1;
        Node node = lookUp.get(key);
        if (node != null) {
            result = node.value;
            remove(node);
            add(node);
        }
        return result;
    }

    public void put(int key, int value) {
        Node node = lookUp.get(key);
        if (node != null) {
            remove(node);
            node.value = value;
            add(node);
        } else {
            if (lookUp.size() == capacity) {
                lookUp.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node update = new Node();
            update.key = key;
            update.value = value;
            lookUp.put(key, update);
            add(update);
        }
    }

    public void add(Node node) {
        Node tmp = head.next;
        head.next = node;
        node.prev = head;
        node.next = tmp;
        tmp.prev = node;
    }

    public void remove(Node node) {
        Node prevNode = node.prev;
        Node nextNode = node.next;
        nextNode.prev = prevNode;
        prevNode.next = nextNode;
    }

    class Node {
        int key;
        int value;
        Node prev;
        Node next;
    }
}