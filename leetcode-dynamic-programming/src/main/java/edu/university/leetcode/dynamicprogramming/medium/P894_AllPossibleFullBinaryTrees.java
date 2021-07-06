package edu.university.leetcode.dynamicprogramming.medium;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static edu.university.leetcode.dynamicprogramming.medium.P337_HouseRobberIII.TreeNode;
/**
 * 894. All Possible Full Binary Trees
 * Given an integer n, return a list of all possible full binary trees with n nodes. Each node of each tree in the answer must have Node.val == 0.
 * Each element of the answer is the root node of one possible tree. You may return the final list of trees in any order.
 * A full binary tree is a binary tree where each node has exactly 0 or 2 children.
 * Example 1: Input: n = 3 Output: [[0,0,0]]
 * Example 2: Input: n = 5
 * Output: [[0,0,0,null,null,0,0],[0,0,0,0,0]]
 * Example 3: Input: n = 7
 * Output: [[0,0,0,null,null,0,0,null,null,0,0],[0,0,0,null,null,0,0,0,0],[0,0,0,0,0,0,0],[0,0,0,0,0,null,null,null,null,0,0],[0,0,0,0,0,null,null,0,0]]
 * Constraints:
 * 1 <= n <= 20
 */
public class P894_AllPossibleFullBinaryTrees {
    public List<TreeNode> allPossibleFBT(int n) {
        if (n % 2 == 0) return Collections.emptyList();
        if (n == 1) return List.of(new TreeNode(0));
        List<TreeNode> result = new LinkedList<>();
        n--;
        for (int i = 1; i <= n / 2; i += 2) {
            List<TreeNode> left = allPossibleFBT(i);
            List<TreeNode> right = allPossibleFBT(n - i);
            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode root = new TreeNode(0, l, r);
                    result.add(root);
                    if (i != n - i) {
                        TreeNode swapRoot = new TreeNode(0, r, l);
                        result.add(swapRoot);
                    }
                }
            }
        }
        return result;
    }
}
