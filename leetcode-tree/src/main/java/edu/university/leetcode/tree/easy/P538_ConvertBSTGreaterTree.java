package edu.university.leetcode.tree.easy;

import edu.university.leetcode.tree.TreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 538. Convert BST to Greater Tree
 * Given a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to
 * the original key plus sum of all keys greater than the original key in BST.
 * Example:
 * Input: The root of a Binary Search Tree like this:
 *               5
 *             /   \
 *            2     13
 * Output: The root of a Greater Tree like this:
 *              18
 *             /   \
 *           20     13
 */
public class P538_ConvertBSTGreaterTree {

    private static Logger LOG = LoggerFactory.getLogger(P538_ConvertBSTGreaterTree.class);

    public TreeNode convertBST(TreeNode root) {
        if (root == null) return root;
        traversal(root, 0);
        return root;
    }

    private int traversal(TreeNode node, int sum) {
        LOG.info("sum = {}", sum);
        if (node == null) return sum;
        node.val += traversal(node.right, sum);
        LOG.info("sum += {}", sum);
        return traversal(node.left, node.val);
    }

}
