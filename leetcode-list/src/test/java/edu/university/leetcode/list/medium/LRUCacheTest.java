package edu.university.leetcode.list.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class LRUCacheTest {

    @Test
    public void test() {
        LRUCache lruCache = new LRUCache(4);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        lruCache.put(3, 3);
        lruCache.put(4, 4);
        assertEquals(4, lruCache.list.head.next.value);
        lruCache.printNode();
        lruCache.get(2);
        assertEquals(2, lruCache.list.head.next.value);
        assertEquals(1, lruCache.list.tail.value);
        lruCache.put(5, 5);
        assertEquals(5, lruCache.list.head.next.value);
        assertEquals(3, lruCache.list.tail.value);
        lruCache.put(3, 3);
        assertEquals(3, lruCache.list.head.next.value);
        assertEquals(4, lruCache.list.tail.value);
        lruCache.printNode();
    }

}