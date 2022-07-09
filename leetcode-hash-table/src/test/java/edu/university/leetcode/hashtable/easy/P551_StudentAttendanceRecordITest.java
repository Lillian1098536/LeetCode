package edu.university.leetcode.hashtable.easy;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class P551_StudentAttendanceRecordITest {
    P551_StudentAttendanceRecordI test = new P551_StudentAttendanceRecordI();
    @Test
    public void checkRecord() {
        assertTrue(test.checkRecord1("PPALLP"));
        assertFalse(test.checkRecord1("PPALLL"));
        assertFalse(test.checkRecord1("PPLLL"));
        assertTrue(test.checkRecord2("PPALLP"));
        assertFalse(test.checkRecord2("PPALLLA"));
        assertFalse(test.checkRecord2("PPLLL"));
        assertTrue(test.checkRecord3("PPALLP"));
        assertFalse(test.checkRecord3("PPALLLA"));
        assertFalse(test.checkRecord3("PPLLL"));
    }
}