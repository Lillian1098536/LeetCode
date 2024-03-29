package edu.university.leetcode.tree.easy;


import edu.university.leetcode.tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class P104_MaximumDepthOfBinaryTreeTest {

    @Test
    public void maxDepth() throws Exception {
        Integer[] array = {1, 2, 3, 4, 5, 6};
        TreeNode input = P100_SameTreeTest.getTreeNode(array);
        int result = P104_MaximumDepthOfBinaryTree.maxDepth(input);
        assertEquals(3, result);
    }

    @Test
    public void maxTreeDepth() throws Exception {
        Integer[] array = {1, 2, 3, 4, 5, 6};
        TreeNode input = P100_SameTreeTest.getTreeNode(array);
        int result = P104_MaximumDepthOfBinaryTree.maxTreeDepth(input);
        assertEquals(3, result);
    }

}