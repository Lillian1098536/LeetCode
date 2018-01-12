package edu.university.leetcode.number.easy;

import edu.university.leetcode.number.easy.P100_SameTree.TreeNode;
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

}