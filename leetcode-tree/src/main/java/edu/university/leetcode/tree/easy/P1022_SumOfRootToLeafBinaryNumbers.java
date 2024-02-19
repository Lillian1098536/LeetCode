package edu.university.leetcode.tree.easy;

import edu.university.leetcode.tree.TreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 1022. Sum of Root To Leaf Binary Numbers
 * Given a binary tree, each node has value 0 or 1.  Each root-to-leaf path represents a binary number starting with the most significant bit.
 * For example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this could represent 01101 in binary, which is 13.
 * For all leaves in the tree, consider the numbers represented by the path from the root to that leaf.
 * Return the sum of these numbers.
 * Example 1:
 *       1
 *     /  \
 *    0    1
 *   / \  / \
 *  0  1 0   1
 * Input: [1,0,1,0,1,0,1] Output: 22
 * Explanation: (100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22
 * Note:
 * The number of nodes in the tree is between 1 and 1000.
 * node.val is 0 or 1.
 * The answer will not exceed 2^31 - 1.
 */
public class P1022_SumOfRootToLeafBinaryNumbers {

    private static Logger LOG = LoggerFactory.getLogger(P1022_SumOfRootToLeafBinaryNumbers.class);


    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int sum) {
        LOG.info("sum = {}", sum);
        if (node == null) return 0;
        sum = sum * 2 + node.val;
        LOG.info("sum += {}", sum);
        if (node.left == null && node.right == null) return sum;
        int leftSum = node.left == null ? 0 : dfs(node.left, sum);
        int rightSum = node.right == null ? 0 : dfs(node.right, sum);
        LOG.info("left + right = {}", leftSum + rightSum);
        return leftSum + rightSum;
    }

}
