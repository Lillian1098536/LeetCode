package edu.university.leetcode.tree.easy;

import edu.university.leetcode.tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class P404_SumOfLeftLeavesTest {

    @Test
    public void sumOfLeftLeaves() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        int result = P404_SumOfLeftLeaves.sumOfLeftLeaves(root);
        assertEquals(24, result);
    }
}