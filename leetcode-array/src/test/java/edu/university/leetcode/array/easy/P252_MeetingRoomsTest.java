package edu.university.leetcode.array.easy;

import edu.university.leetcode.array.medium.P56_MergeIntervals.Interval;
import org.junit.Test;

import static org.junit.Assert.*;

public class P252_MeetingRoomsTest {
    P252_MeetingRooms test = new P252_MeetingRooms();
    @Test
    public void canAttendMeetings() {
        Interval[] intervals = new Interval[3];
        intervals[0] = new Interval(0, 30);
        intervals[1] = new Interval(5, 20);
        intervals[2] = new Interval(15, 20);
        assertTrue(!test.canAttendMeetings(intervals));
    }
    @Test
    public void canAttendMeetingsTrue() {
        Interval[] intervals = new Interval[3];
        intervals[0] = new Interval(0, 10);
        intervals[1] = new Interval(10, 20);
        intervals[2] = new Interval(20, 30);
        assertTrue(test.canAttendMeetings(intervals));
    }
}