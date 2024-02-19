package edu.university.leetcode.tree.medium;

import edu.university.leetcode.tree.TreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;

/**
 * 98. Validate Binary Search Tree
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 * Assume a BST is defined as follows:
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 * Example 1: Input:
 * 8
 * / \
 * 3   10
 * / \    \
 * 1   6    14
 * / \  /
 * 4  7 13
 * Output: true
 * Example 2: Input:
 *     5
 *    / \
 *   1   4
 *  / \
 * 3   6
 * Output: false
 * Explanation: The input is: [5,1,4,null,null,3,6]. The root node's value
 * is 5 but its right child's value is 4.
 */

public class P98_ValidateBinarySearchTree {

    private static Logger LOG = LoggerFactory.getLogger(P98_ValidateBinarySearchTree.class);

    private TreeNode lastNode;

    public boolean isValidBST(TreeNode root) {
        if (root != null) {
            LOG.debug("node value = {}", root.val);
        }
        if (root == null) return true;
        if (!isValidBST(root.left)) return false;
        if (lastNode != null && lastNode.val >= root.val) return false;
        lastNode = root;
        if (!isValidBST(root.right)) return false;
        return true;
    }

    public boolean isValidBST2(TreeNode root) {
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean dfs(TreeNode node, long min, long max) {
        if (node == null) {
            return true;
        }
        return node.val > min && node.val < max && dfs(node.left, min, node.val) && dfs(node.right, node.val, max);
    }

    public boolean isValidateBSTNonRecursive(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        int curValue = Integer.MIN_VALUE, preValue = Integer.MIN_VALUE, firstCompare = 1;
        TreeNode current = root;
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                LOG.debug("node value = {}", root.val);
                LOG.debug("current node value = {}", current.val);
                LOG.debug("curValue = {}", curValue);
                LOG.debug("preValue = {}", preValue);
                if (!stack.isEmpty()) {
                    LOG.debug("stack = {}", stack.peek().val);
                }
            }
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                current = stack.peek();
                curValue = current.val;
                if (curValue <= preValue && firstCompare == 0) {
                    return false;
                }
                firstCompare = 0;
                preValue = curValue;
                stack.pop();
                current = current.right;
            }
        }
        return true;
    }

}
