package edu.university.leetcode.number.easy;

import edu.university.leetcode.number.easy.P100_SameTree.TreeNode;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.Assert.*;

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
        Integer[] a1 = {1, 2, 3}, a2 = {1, 2, 3};
        TreeNode p = getTreeNode(a1);
        TreeNode q = getTreeNode(a2);
        boolean result = P100_SameTree.isSameTree(p, q);
        assertTrue(result);
    }

}