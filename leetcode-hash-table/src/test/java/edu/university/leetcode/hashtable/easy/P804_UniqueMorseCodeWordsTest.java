package edu.university.leetcode.hashtable.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class P804_UniqueMorseCodeWordsTest {
    P804_UniqueMorseCodeWords test = new P804_UniqueMorseCodeWords();
    @Test
    public void uniqueMorseRepresentations() {
        assertEquals(2, test.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
        assertEquals(1, test.uniqueMorseRepresentations(new String[]{"a"}));
    }
}