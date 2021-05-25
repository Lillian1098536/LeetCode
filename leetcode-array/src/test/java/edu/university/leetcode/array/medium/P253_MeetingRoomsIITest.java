package edu.university.leetcode.array.medium;

import edu.university.leetcode.array.medium.P56_MergeIntervals.Interval;
import org.junit.Test;

import static org.junit.Assert.*;

public class P253_MeetingRoomsIITest {
    P253_MeetingRoomsII test = new P253_MeetingRoomsII();
    @Test
    public void minMeetingRooms() {
        Interval i1 = new Interval(0, 30);
        Interval i2 = new Interval(5, 10);
        Interval i3 = new Interval(15, 20);
        Interval[] intervals = new Interval[] {i1, i2, i3};
        assertEquals(2, test.minMeetingRooms(intervals));
    }
}