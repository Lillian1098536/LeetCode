package edu.university.leetcode.hashtable.medium;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class P2405_OptimalPartitionOfStringTest {
    P2405_OptimalPartitionOfString test = new P2405_OptimalPartitionOfString();
    @Test
    public void partitionString() {
        assertEquals(4, test.partitionString("abacaba"));
        assertEquals(6, test.partitionString("ssssss"));
    }
}