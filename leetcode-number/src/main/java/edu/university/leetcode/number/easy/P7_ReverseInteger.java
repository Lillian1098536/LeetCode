package edu.university.leetcode.number.easy;

import lombok.extern.slf4j.Slf4j;

 /**
 * 7. Reverse Integer
 * Given a 32-bit signed integer, reverse digits of an integer.
 * The 32-bit int data type can hold integer values in the range of −2,147,483,648 to 2,147,483,647
 */
@Slf4j
public class P7_ReverseInteger {

    public static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int tail = x % 10;
            log.debug("tail={}", tail);
            int tmp = result * 10 + tail;
            // check overflow
            if ((tmp - tail) / 10 != result) {
                log.debug("overflow");
                return 0;
            }
            log.debug("result={}", tmp);
            result = tmp;
            x = x / 10;
        }
        return result;
    }

    public static int reverseInteger(int x) {
        long result = 0;
        while (x != 0) {
            int tail = x % 10;
            log.debug("tail={}", tail);
            result = result * 10 + tail;
            log.debug("result={}", result);
            x = x / 10;
        }
        // check overflow
        return (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) ? 0 : (int)result;
    }

}
