package edu.university.leetcode.string.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * 434. Number of Segments in a String
 * Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.
 * Please note that the string does not contain any non-printable characters.
 * Example: Input: "Hello, my name is John" Output: 5
 */
@Slf4j
public class P434_NumberOfSegmentsInAString {

    public static int countSegments(String s) {
        if (s == null || s.length() == 0) return 0;
        String[] segments = s.trim().split("\\s+");
        log.info("segments = {}", Arrays.toString(segments));
        return segments.length;
    }

    public static int countSegs(String s) {
        int ct = 0;
        boolean isSpace = true;

        for(char c : s.toCharArray()){
            if(!Character.isSpaceChar(c)){
                if(isSpace){
                    ct++;
                }
                isSpace = false;
            }else {
                isSpace = true;
            }
        }
        return ct;
    }

}
