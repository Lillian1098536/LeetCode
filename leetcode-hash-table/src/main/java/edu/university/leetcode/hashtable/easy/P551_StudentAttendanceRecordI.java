package edu.university.leetcode.hashtable.easy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 * 551. Student Attendance Record I
 * You are given a string s representing an attendance record for a student where each character signifies
 * whether the student was absent, late, or present on that day. The record only contains the following three characters:
 * 'A': Absent. 'L': Late. 'P': Present.
 * The student is eligible for an attendance award if they meet both of the following criteria:
 * The student was absent ('A') for strictly fewer than 2 days total.
 * The student was never late ('L') for 3 or more consecutive days.
 * Return true if the student is eligible for an attendance award, or false otherwise.
 * Example 1: Input: s = "PPALLP" Output: true
 * Explanation: The student has fewer than 2 absences and was never late 3 or more consecutive days.
 * Example 2: Input: s = "PPALLL" Output: false
 * Explanation: The student was late 3 consecutive days in the last 3 days, so is not eligible for the award.
 * Constraints:
 * 1 <= s.length <= 1000
 * s[i] is either 'A', 'L', or 'P'.
 */
public class P551_StudentAttendanceRecordI {
    private static final Logger LOG = LogManager.getLogger(P551_StudentAttendanceRecordI.class);
    //hash-table String
    public boolean checkRecord1(String s) {
        Map<Character, Integer> attendances = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (c != 'L') {
                attendances.put('L', 0);
            }
            attendances.put(c, attendances.getOrDefault(c, 0) + 1);
            if (c == 'A' && attendances.getOrDefault(c, 0) > 1) {
                return false;
            }
            if (c == 'L' && attendances.getOrDefault(c, 0) > 2) {
                return false;
            }
        }
        return true;
    }
    public boolean checkRecord2(String s) {
        LOG.info("indexOf A {}", s.indexOf("A"));
        LOG.info("lastIndexOf A {}", s.lastIndexOf("A"));
        return s.indexOf("A") == s.lastIndexOf("A") && !s.contains("LLL");
    }

    public boolean checkRecord3(String s) {
        char[] ch = s.toCharArray();
        int countA = 0, countMaxL = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'A') {
                countA++;
            } else if (ch[i] == 'L') {
                int count = 1;
                i++;
                while (i < ch.length && ch[i] == 'L') {
                    count++;
                    i++;
                }
                i--;
                countMaxL = Math.max(countMaxL, count);
            }
        }
        return (countA < 2 && countMaxL < 3);
    }
}
