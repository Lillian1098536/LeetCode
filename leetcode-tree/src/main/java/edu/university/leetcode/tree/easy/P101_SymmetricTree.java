package edu.university.leetcode.tree.easy;

import edu.university.leetcode.tree.TreeNode;

import java.util.LinkedList;

/**
 * 101. Symmetric Tree
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 * 1
 * / \
 * 2   2
 * / \ / \
 * 3  4 4  3
 * But the following [1,2,2,null,3,null,3] is not:
 * 1
 * / \
 * 2   2
 * \   \
 * 3    3
 * Note: Bonus points if you could solve it both recursively and iteratively.
 */
public class P101_SymmetricTree {

    public boolean isSymmetricRecursive(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetricTree(root.left, root.right);
    }

    public static boolean isSymmetricTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == null && q == null;
        }
        return p.val == q.val && isSymmetricTree(p.left, q.right) && isSymmetricTree(p.right, q.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null || root.right == null) {
            return root.left == null && root.right == null;
        }
        LinkedList<TreeNode> p = new LinkedList<>();
        LinkedList<TreeNode> q = new LinkedList<>();
        p.add(root.left);
        q.add(root.right);
        while (!p.isEmpty() && !q.isEmpty()) {
            TreeNode l = p.poll();
            TreeNode r = q.poll();
            if (l.val != r.val) {
                return false;
            }
            if ((l.left == null && r.right != null) || (l.left != null && r.right == null) ||
                    (l.right == null && r.left != null) || (l.right != null && r.left == null)) {
                return false;
            }
            if (l.left != null && r.right != null) {
                p.add(l.left);
                q.add(r.right);
            }
            if (l.right != null && r.left != null) {
                p.add(l.right);
                q.add(r.left);
            }
        }
        return true;
    }

}

