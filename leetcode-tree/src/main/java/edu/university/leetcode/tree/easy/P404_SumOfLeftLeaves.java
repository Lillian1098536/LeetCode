package edu.university.leetcode.tree.easy;

import edu.university.leetcode.tree.TreeNode;
import lombok.extern.slf4j.Slf4j;

/**
 * 404. Sum of Left Leaves
 * Find the sum of all left leaves in a given binary tree.
 * Example:
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 */
@Slf4j
public class P404_SumOfLeftLeaves {

    public static int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeaves(root, false);
    }

    public static int sumOfLeftLeaves(TreeNode root, boolean isLeft) {
        log.info("isLeft = {}", isLeft);
        if (root == null) return 0;
        int sum = 0;
        if (root.left != null || root.right != null) {
            sum += sumOfLeftLeaves(root.left, true);
            sum += sumOfLeftLeaves(root.right, false);
            log.info("sum = {}", sum);
        } else if (isLeft) {
            sum += root.val;
            log.info("left sum = {}", sum);
        }
        return sum;
    }

}
