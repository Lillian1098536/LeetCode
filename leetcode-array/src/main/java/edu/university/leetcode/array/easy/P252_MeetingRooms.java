package edu.university.leetcode.array.easy;

import edu.university.leetcode.array.medium.P56_MergeIntervals.Interval;

import java.util.Arrays;

/**
 * 252. Meeting Rooms
 * Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), determine if a person could attend all meetings.
 * For example: Given [[0, 30],[5, 10],[15, 20]], return false.
 */
public class P252_MeetingRooms {

    public static boolean canAttendMeetings(Interval[] intervals) {
        if (intervals == null || intervals.length == 0) return false;
        Arrays.sort(intervals, (t1, t2) -> {
            if (t1.start != t1.start) {
                return t1.start - t2.start;
            } else {
                return t1.end - t2.end;
            }
        });
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start < intervals[i - 1].end) {
                return false;
            }
        }
        return true;
    }
}
