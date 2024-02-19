package edu.university.leetcode.tree.medium;

import edu.university.leetcode.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

import static edu.university.leetcode.tree.TreeNode.inorder;

/**
 * 99. Recover Binary Search Tree
 * You are given the root of a binary search tree (BST), where the values of exactly two nodes of the tree were swapped by mistake.
 * Recover the tree without changing its structure.
 * Example 1: Input: root = [1,3,null,null,2] Output: [3,1,null,null,2]
 *   1        3
 *  /        /
 * 3   ->   1
 *  \       \
 *   2       2
 * Explanation: 3 cannot be a left child of 1 because 3 > 1. Swapping 1 and 3 makes the BST valid.
 * Example 2: Input: root = [3,1,4,null,null,2] Output: [2,1,4,null,null,3]
 * Explanation: 2 cannot be in the right subtree of 3 because 2 < 3. Swapping 2 and 3 makes the BST valid.
 * Constraints:
 * The number of nodes in the tree is in the range [2, 1000].
 * -231 <= Node.val <= 231 - 1
 * Follow up: A solution using O(n) space is pretty straight-forward. Could you devise a constant O(1) space solution?
 */
public class P99_RecoverBinarySearchTree {
    public void recoverTree(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        dfs(list, root);
        TreeNode x = null;
        TreeNode y = null;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).val > list.get(i + 1).val) {
                y = list.get(i + 1);
                if (x == null) {
                    x = list.get(i);
                }
            }
        }
        if (x != null && y != null) {
            int tmp = x.val;
            x.val = y.val;
            y.val = tmp;
        }
    }

    public static void dfs(List<TreeNode> res, TreeNode root) {
        if (root == null) return;
        dfs(res, root.left);
        res.add(root);
        dfs(res, root.right);
    }

}
