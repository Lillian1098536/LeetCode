package edu.university.leetcode.array.hard;

import java.util.Arrays;

/**
 * Problem Statement:
 * When customers book an Airbnb the total price, which includes base price + service fee + cleaning fee.
 * all these prices are in decimals.
 * Write an algorithm to round each price such that the sum of the prices equals
 * the round of the total sum of all decimal prices and minimize the rounding.
 * Given:
 * An array of numbers A = [x1, x2, ..., xn] and Target = Round(x1+x2+... +xn)
 * where x1, x2,..xn are different charges to customers like base price, service fee and so on.
 * Example 1: input: [30.3, 2.4, 3.5] output: [30, 2, 4]
 * Example 1: input: [30.9, 2.4, 3.9] output: [31, 2, 4]
 */
public class P_RoundPrices {
    /**
     * selection sort
     * 1. Calculate Ceil and Floor for each given price.
     * 2. Get the sum of all prices and calculate the target price = round (sum of all prices).
     * 3. Calculate floorSum with all floor prices.
     * 4. Get difference d = target – floorSum. (pick ceil values on prices)
     * 5. Create an array PriceWithDiff with each price with Ceil, floor, and difference of price with ceil value.
     * 6. Sort the array on the difference of price with ceil value. (pick the ceil values with less rounding margin)
     * 7. Pick the first d ceil values from PriceWithDiff and pick the floor from the rest of the array.
     * Time Complexity: O(n(Log(n))),
     * Space Complexity: O(n)
     * @param arr
     * @return rounded prices
     */
    public int[] roundUp(double[] arr) {
        int len = arr.length, floorSum = 0;
        double sum = 0.0;
        PriceWithDiff[] diff = new PriceWithDiff[len];
        for (int i = 0; i < len; i++) {
            int floor = (int) arr[i], ceil = floor;
            if (floor < arr[i]) {
                ceil++;
            }
            floorSum += floor;
            sum += arr[i];
            diff[i] = new PriceWithDiff(ceil, ceil - arr[i]);
        }
        System.out.println("PriceWithDiff = " + Arrays.toString(diff));
        int target = (int) Math.round(sum), d = target - floorSum;
        System.out.println("Round sum = " + target + " diff with floorSum = " + d);
        Arrays.sort(diff, (o1, o2) -> {
            if (o1.diffWithCeil <= o2.diffWithCeil) return -1;
            else return 1;
        });
        System.out.println("Sorted PriceWithDiff = " + Arrays.toString(diff));
        int[] res = new int[len];
        int i = 0;
        for (; i < d; i++) {
            res[i] = diff[i].num; //insert ceil
            System.out.println("insert ceil = " + diff[i].num);
        }
        for (; i < len; i++) {
            res[i] = diff[i].num - 1; //insert floor
            System.out.println("insert floor = " + (diff[i].num - 1));
        }
        return res;
    }

    class PriceWithDiff {
        int num;
        double diffWithCeil;

        public PriceWithDiff(int num, double diffWithCeil) {
            this.num = num;
            this.diffWithCeil = diffWithCeil;
        }

        @Override
        public String toString() {
            return "\nPriceWithDiff{num=" + num + ", diffWithCeil=" + diffWithCeil + '}';
        }
    }

    public static void main(String[] args) {
        P_RoundPrices test = new P_RoundPrices();
        System.out.println(Arrays.toString(test.roundUp(new double[]{30.3, 2.4, 3.5})) + "\n");
        System.out.println(Arrays.toString(test.roundUp(new double[]{30.9, 2.4, 3.9})));
    }
}
