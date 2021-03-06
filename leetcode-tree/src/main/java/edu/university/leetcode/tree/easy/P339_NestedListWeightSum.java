package edu.university.leetcode.tree.easy;

import java.util.List;

/**
 * 339. Nested List Weight Sum
 * Given a nested list of integers, return the sum of all integers in the list weighted by their depth.
 * Each element is either an integer, or a list -- whose elements may also be integers or other lists.
 * Example 1:
 * Given the list [[1,1],2,[1,1]], return 10. (four 1's at depth 2, one 2 at depth 1)
 * Example 2:
 * Given the list [1,[4,[6]]], return 27. (one 1 at depth 1, one 4 at depth 2, and one 6 at depth 3; 1 + 4 * 2 + 6 * 3 = 27)
 */
public class P339_NestedListWeightSum {

    public int depthSum(List<NestedInteger> nestedList) {
        return depthSum(nestedList, 1);
    }

    public int depthSum(List<NestedInteger> nestedList, int weight) {
        int sum = 0;
        for (NestedInteger nestedInteger :  nestedList) {
            if (nestedInteger.isInteger()) {
                sum += nestedInteger.getInteger() * weight;
            } else {
                sum += depthSum(nestedInteger.getList(), weight + 1);
            }
        }
        return sum;
    }

    public static class NestedInteger {

        Integer theSingleInteger;
        List<NestedInteger> theList;

        public NestedInteger(Integer theSingleInteger, List<NestedInteger> theList) {
            this.theSingleInteger = theSingleInteger;
            this.theList = theList;
        }

        public boolean isInteger() {
            return null == theList && null != theSingleInteger;
        }

        public Integer getInteger() {
            return theSingleInteger;
        }

        public List<NestedInteger> getList() {
            return theList;
        }

    }

}
