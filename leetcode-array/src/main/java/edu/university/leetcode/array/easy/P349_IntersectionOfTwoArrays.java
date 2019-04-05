package edu.university.leetcode.array.easy;

import org.apache.commons.lang3.ArrayUtils;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 349. Intersection of Two Arrays
 * Given two arrays, write a function to compute their intersection.
 * Example 1: Input: nums1 = [1,2,2,1], nums2 = [2,2]  Output: [2]
 * Example 2:  Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]  Output: [9,4]
 * Note: Each element in the result must be unique. The result can be in any order.
 */
public class P349_IntersectionOfTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> setNums = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for (int n : nums1) {
            setNums.add(n);
        }
        for (int n : nums2) {
            if (setNums.contains(n)) {
                set.add(n);
            }
        }
//        int[] result = new int[set.size()];
//        Iterator<Integer> it = set.iterator();
//        int i = 0;
//        while (it.hasNext()) {
//            result[i++] = it.next();
//        }
//        return result;
        return ArrayUtils.toPrimitive(set.toArray(new Integer[0]));
    }

}
