package edu.university.leetcode.string.easy;

/**
 * 1736. Latest Time by Replacing Hidden Digits
 * You are given a string time in the form of hh:mm, where some of the digits in the string are hidden (represented by ?).
 * The valid times are those inclusively between 00:00 and 23:59.
 * Return the latest valid time you can get from time by replacing the hidden digits.
 * Example 1: Input: time = "2?:?0" Output: "23:50"
 * Explanation: The latest hour beginning with the digit '2' is 23 and the latest minute ending with the digit '0' is 50.
 * Example 2: Input: time = "0?:3?" Output: "09:39"
 * Example 3: Input: time = "1?:22" Output: "19:22"
 * Constraints:
 * time is in the format hh:mm.
 * It is guaranteed that you can produce a valid time from the given string.
 */
public class P1736_LatestTimeByReplacingHiddenDigits {
    //greedy
    public String maximumTime(String time) {
        StringBuilder sb = new StringBuilder();
        if (time.charAt(0) == '?') {
            if (time.charAt(1) == '?' || time.charAt(1) == '0' || time.charAt(1) == '1' || time.charAt(1) == '2' || time.charAt(1) == '3') {
                sb.append("2");
            } else {
                sb.append("1");
            }
        } else {
            sb.append(time.charAt(0));
        }
        if (time.charAt(1) == '?') {
            if (time.charAt(0) == '0' || time.charAt(0) == '1') {
                sb.append("9");
            } else {
                sb.append("3");
            }
        } else {
            sb.append(time.charAt(1));
        }
        sb.append(":");
        if (time.charAt(3) == '?') {
            sb.append("5");
        } else {
            sb.append(time.charAt(3));
        }
        if (time.charAt(4) == '?') {
            sb.append("9");
        } else {
            sb.append(time.charAt(4));
        }
        return sb.toString();
    }
}
