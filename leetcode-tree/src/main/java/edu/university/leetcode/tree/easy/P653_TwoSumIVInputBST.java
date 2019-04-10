package edu.university.leetcode.tree.easy;

import java.util.ArrayList;
import java.util.List;

import static edu.university.leetcode.tree.easy.P100_SameTree.TreeNode;
/**
 * 653. Two Sum IV - Input is a BST
 * Given a Binary Search Tree and a target number, return true if there exist two elements in the BST such that their sum is equal to the given target.
 * Example 1:
 * Input:
 *     5
 *    / \
 *   3   6
 *  / \   \
 * 2   4   7
 * Target = 9 Output: True
 * Example 2:
 * Input:
 *     5
 *    / \
 *   3   6
 *  / \   \
 * 2   4   7
 * Target = 28 Output: False
 */
public class P653_TwoSumIVInputBST {

    public static boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        helper(list, root);
        int left = 0, right = list.size() - 1;
        while ( left < right) {
            if (list.get(left) + list.get(right) == k) {
                return true;
            } else if (list.get(left) + list.get(right) < k) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    private static void helper(List<Integer> list, TreeNode node) {
        if (node == null) {
            return;
        }
        helper(list, node.left);
        list.add(node.val);
        helper(list, node.right);
    }

}
