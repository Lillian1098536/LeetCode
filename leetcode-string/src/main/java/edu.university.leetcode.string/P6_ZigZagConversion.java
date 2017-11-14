package edu.university.leetcode.string;

import lombok.extern.slf4j.Slf4j;

/**
 * 6. Zigzag Conversion
 * A zigzag is a pattern made up of small corners at variable angles, though constant within the zigzag, tracing a path between two parallel lines;
 * it can be described as both jagged and fairly regular.
 *
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this
 * P.......A........H.......N
 * ..A..P....L....S....I...I....G
 * ....Y.........I........R
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 * A....C
 * ...B....D
 *
 * For any full columns, the odd ones have nRows characters, even ones have (nRows - 2) characters.
 * For the first and last rows, we read one single character from each expended column;
 * For the rest of rows, we read two characters, one from top part and one from bottom part, from each expended column.
 * One edge case is that nRows = 1, where (nRows*2 - 2) becomes 0. In this case, we should simply return the original string.
 */
@Slf4j
public class P6_ZigZagConversion {

    public static String convert(String s, int numRows) {
        if(numRows == 1)
            return s;
        StringBuilder result = new StringBuilder();
        int n = numRows + numRows - 2;
        for(int i = 0; i < numRows; i++){
            log.debug("i={}", i);
            int cur = i;
            while(cur < s.length()){
                log.debug("cur={} append={}", cur, s.charAt(cur));
                result.append(s.charAt(cur));
                cur += n;
                if(i > 0 && i < numRows - 1 && (cur - i - i) < s.length()){
                    log.debug("cur-i-i={} append={}", cur - i - i, s.charAt(cur - i - i));
                    result.append(s.charAt(cur - i - i));
                }
            }
        }
        return result.toString();
    }

}
