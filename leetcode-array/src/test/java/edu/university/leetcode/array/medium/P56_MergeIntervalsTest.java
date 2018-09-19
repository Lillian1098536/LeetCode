package edu.university.leetcode.array.medium;

import static edu.university.leetcode.array.medium.P56_MergeIntervals.Interval;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class P56_MergeIntervalsTest {
    @Test
    public void merge() throws Exception {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 4));
        intervals.add(new Interval(0, 4));
        List<Interval> result = P56_MergeIntervals.merge(intervals);
        List<Interval> expected = new ArrayList<>();
        expected.add(new Interval(0, 4));
        assertEquals(expected.get(0).start, result.get(0).start);
    }

}