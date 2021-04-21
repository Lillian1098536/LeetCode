package edu.university.leetcode.string.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 412. Fizz Buzz
 * Write a program that outputs the string representation of numbers from 1 to n.
 * But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”.
 * For numbers which are multiples of both three and five output “FizzBuzz”.
 */
public class P412_FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String tmp = "";
            if (i % 3 == 0) tmp += "Fizz";
            if (i % 5 == 0) tmp += "Buzz";
            if (tmp == "") {
                result.add(Integer.toString(i));
            } else {
                result.add(tmp);
            }
        }
        return result;
    }
}
