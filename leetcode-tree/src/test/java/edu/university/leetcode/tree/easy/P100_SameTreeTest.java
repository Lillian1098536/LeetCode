package edu.university.leetcode.tree.easy;

import edu.university.leetcode.tree.TreeNode;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.Assert.assertTrue;

public class P100_SameTreeTest {

    public static TreeNode getTreeNode(Integer[] array) {
        TreeNode root = new TreeNode(array[0]);
        if (array == null || array.length == 0) {
            return null;
        }
        if (array[0] == null) {
            throw new RuntimeException();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int index = 1;
        while (index < array.length && !queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (array[index] != null) {
                node.left = new TreeNode(array[index]);
                queue.add(node.left);
            }
            index++;
            if (index < array.length && array[index] != null) {
                node.right = new TreeNode(array[index]);
                queue.add(node.right);
                index++;
            }
        }
        if (index < array.length) {
            throw new RuntimeException();
        }
        return root;
    }

    @Test
    public void isSameTree() throws Exception {
        P100_SameTree test = new P100_SameTree();
        Integer[] a1 = {1, 2, 3}, a2 = {1, 2, 3};
        TreeNode p = getTreeNode(a1);
        TreeNode q = getTreeNode(a2);
        boolean result = test.isSameTree(p, q);
        assertTrue(result);
    }

}