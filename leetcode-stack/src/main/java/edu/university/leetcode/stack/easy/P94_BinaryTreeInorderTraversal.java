package edu.university.leetcode.stack.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 94. Binary Tree Inorder Traversal
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 * Example 1: Input: root = [1,null,2,3] Output: [1,3,2]
 * Example 2: Input: root = [] Output: []
 * Example 3: Input: root = [1] Output: [1]
 * Constraints:
 * The number of nodes in the tree is in the range [0, 100].
 * -100 <= Node.val <= 100
 */
public class P94_BinaryTreeInorderTraversal {
    /**
     * Time Complex O(n)
     * Space Complex O(h)
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (stack.size() > 0 || root != null) {
            //moving to left, add every node to stack
            //simulate recursive
            if (root != null) {
                stack.add(root);
                root = root.left;
            } else {
                //when current node is empty, get the end of left, jump out of the current node
                //moving to right
                TreeNode tmp = stack.pop();
                list.add(tmp.val);
                root = tmp.right;
            }
        }
        return list;
    }

    /**
     * dfs + recursive
     * Time Complex O(n)
     * Space Complex O(h)
     */
    public List<Integer> inorderTraversalRecursive(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(list, root);
        return list;
    }
    void dfs(List<Integer> list, TreeNode root){
        if (root == null) {
            return;
        }
        dfs(list, root.left);
        list.add(root.val);
        dfs(list, root.right);
    }

    /**
     * Morris traversal, a tree traversal algorithm that doesn't employ the use of recursion or a stack
     * links are created as successors and nodes are printed using these links, finally the changes are reverted to restore the original tree
     * Time Complex O(n)
     * Space Complex O(1)
     */
    public List<Integer> morrisInorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        TreeNode pre = null;
        while (root != null) {
            if (root.left != null) {
                //moving to left 1 step
                pre = root.left;
                //moving to right till end
                while (pre.right != null) {
                    pre = pre.right;
                }
                //move node to right
                pre.right = root;
                //move left to node, and node to righ
                TreeNode tmp = root;
                root = root.left;
                tmp.left = null;
            } else {
                list.add(root.val);
                root = root.right;
            }
        }
        return list;
    }

        public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}
        TreeNode(int val) {this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
