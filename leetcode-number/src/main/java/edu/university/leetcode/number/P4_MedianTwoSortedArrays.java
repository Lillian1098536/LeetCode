package edu.university.leetcode.number;

import lombok.extern.slf4j.Slf4j;

/**
 * 4. Median of Two Sorted Arrays
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * Example 1: nums1 = [1, 3] nums2 = [2] The median is 2.0
 * Example 2: nums1 = [1, 2] nums2 = [3, 4] The median is (2 + 3)/2 = 2.5
 */
@Slf4j
public class P4_MedianTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int total = nums1.length + nums2.length;

        if (total % 2 == 0) {
            return (findK(total / 2 + 1, nums1, nums2, 0, 0) + findK(total / 2, nums1, nums2, 0, 0)) / 2.0;
        } else {
            return findK(total / 2 + 1, nums1, nums2, 0, 0);
        }

    }

    public static int findK(int k, int[] nums1, int[] nums2, int s1, int s2) {

        log.debug("k={} s1={} s2={}", k, s1, s2);
        if (s1 >= nums1.length) {
            return nums2[s2 + k - 1];
        }
        if (s2 >= nums2.length) {
            return nums1[s1 + k - 1];
        }
        if (k == 1) {
            log.debug("when k = 1, min={}", Math.min(nums1[s1], nums2[s2]));
            return Math.min(nums1[s1], nums2[s2]);
        }

        int m1 = s1 + k / 2 - 1;
        int m2 = s2 + k / 2 - 1;

        int mid1 = m1 < nums1.length ? nums1[m1] : Integer.MAX_VALUE;
        int mid2 = m2 < nums2.length ? nums2[m2] : Integer.MAX_VALUE;

        log.debug("m1={} m2={} mid1={} mid2={}", m1, m2, mid1, mid2);
        if (mid1 < mid2) {
            return findK(k - k / 2, nums1, nums2, m1 + 1, s2);
        } else {
            return findK(k - k / 2, nums1, nums2, s1, m2 + 1);
        }
    }

    public static double findMedianSortedArraysRecursive(int[] A, int[] B) {
        int m = A.length, n = B.length;
        int l = (m + n + 1) / 2, r = (m + n + 2) / 2;

        return  (getKth(A, 0, B, 0, l) + getKth(A, 0 , B, 0, r)) / 2.0;
    }

    public static double getKth(int[] A, int aStart, int[] B, int bStart, int k) {
        log.debug("k={} aStart={} bStart={}", k, aStart, bStart);
        if (aStart > A.length - 1) return B[bStart + k - 1];
        if (bStart > B.length - 1) return A[aStart + k - 1];

        if (k == 1) {
            log.debug("when k=1, median={}", Math.min(A[aStart], B[bStart]));
            return Math.min(A[aStart], B[bStart]);
        }

        int aMid = ((aStart + k / 2 - 1) < A.length) ? A[aStart + k / 2 - 1] : Integer.MAX_VALUE;
        int bMid = ((bStart + k / 2 - 1) < B.length) ? B[bStart + k / 2 - 1] : Integer.MAX_VALUE;

        log.debug("aMid=A[{}]={} bMid=B[{}]={}", aStart + k / 2 - 1, aMid, bStart + k / 2 - 1, bMid);
        if (aMid < bMid) {
            // check: aRright + bLeft
            log.debug("aStart={}", aStart + k / 2);
            return getKth(A, aStart + k / 2, B, bStart, k - k / 2);
        } else {
            // check: bRight + aLeft
            log.debug("bStart={}", bStart + k / 2);
            return getKth(A, aStart, B, bStart + k / 2, k - k / 2);
        }
    }
}
