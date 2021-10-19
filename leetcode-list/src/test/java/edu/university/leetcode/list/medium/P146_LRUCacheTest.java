package edu.university.leetcode.list.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class P146_LRUCacheTest {
    @Test
    public void test() {
        P146_LRUCache test = new P146_LRUCache(2);
        test.put(1, 1);
        test.put(2, 2);
        assertEquals(1, test.get(1));
        assertEquals(1, test.head.next.value);
        assertEquals(2, test.tail.prev.value);
        test.put(3, 3);
        assertEquals(3, test.head.next.value);
        assertEquals(1, test.tail.prev.value);
        assertEquals(-1, test.get(2));
        test.put(4, 4);
        assertEquals(4, test.head.next.value);
        assertEquals(3, test.tail.prev.value);
        assertEquals(3, test.get(3));
        assertEquals(3, test.head.next.value);
        assertEquals(4, test.tail.prev.value);
        assertEquals(4, test.get(4));
        assertEquals(4, test.head.next.value);
        assertEquals(3, test.tail.prev.value);
    }
}