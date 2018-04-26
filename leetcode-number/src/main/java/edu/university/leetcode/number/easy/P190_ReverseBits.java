package edu.university.leetcode.number.easy;

import lombok.extern.slf4j.Slf4j;

/**
 * 190. Reverse Bits
 * Reverse bits of a given 32 bits unsigned integer.
 * For example, given input 43261596 (represented in binary as 00000010100101000001111010011100),
 * return 964176192 (represented in binary as 00111001011110000010100101000000).
 */
@Slf4j
public class P190_ReverseBits {

    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            log.debug("i={}", i);
            result <<= 1;
            log.debug("result <<= 1 = {}", Integer.toBinaryString(result));
            result += n & 1;
            log.debug("result += n & 1 = {}", Integer.toBinaryString(result));
            n >>>= 1; // n >>= 1;
            log.debug("n = {}", Integer.toBinaryString(n));
        }
        return result;
    }

    public int reverse(int n) {
        int res = n;
        res = res << 16 | res >>> 16;
        res = (res & 0x00ff00ff) << 8 | (res & 0xff00ff00) >>> 8;
        res = (res & 0x0f0f0f0f) << 4 | (res & 0xf0f0f0f0) >>> 4;
        res = (res & 0x33333333) << 2 | (res & 0xcccccccc) >>> 2;
        res = (res & 0x55555555) << 1 | (res & 0xaaaaaaaa) >>> 1;
        return res;
    }
}
