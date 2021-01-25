package edu.university.leetcode.number.easy;

/**
 * 202. Happy Number
 * Write an algorithm to determine if a number is "happy".
 * A happy number is a number defined by the following process: Starting with any positive integer,
 * replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay),
 * or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 * Example: Input: 19
 * Output: true
 * Explanation:
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 * unhappy number circle 4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4
 * 3 -> 9 -> 81 -> 65 -> 61 -> 37 -> 58 -> 89 -> 145 -> 42 -> 20 -> 4
 * happy number 1, 7, 10, 13, 19, 23, 28, 31, 32, 44, 49, 68, 70, 79, 82, 86, 91, 94, 97, 100
 * 7 -> 49 -> 97 -> 130 -> 10 -> 1
 * 10 -> 1
 * 13 -> 10
 * 19 -> 10
 * 23 -> 13
 * 28 -> 68 -> 100 -> 1
 * 31 -> 10
 * 32 -> 13
 * 44 -> 32
 * 49 -> 97 -> 130
 * 70 -> 49
 * 79 -> 130
 * 82 -> 68
 * 86 -> 100 -> 1
 * 91 -> 10
 * 94 -> 97
 */
public class P202_HappyNumber {

    public static boolean isHappy(int n) {
        while(n >= 10){
            n = getNumber(n);
        }
        System.out.print("n=" + n);
        return (n == 1 || n == 7);
    }

    private static int getNumber(int n) {
        int result = 0;
        while (n > 0) {
            result += Math.pow(n % 10, 2);
            n /= 10;
        }
        System.out.print(" -> " + result);
        return result;
    }

    public static boolean isHappyNumber(int n) {
        // 4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4
        while(n != 1){
            n = getNext(n);
            if(n == 4){
                return false;
            }
        }
        return true;
    }

    private static int getNext(int n){
        int d = 0;
        System.out.print(n + " -> ");
        while(n != 0){
            d += Math.pow(n % 10, 2);
            n /= 10;
        }
        System.out.println("d=" + d);
        return d;
    }

}
