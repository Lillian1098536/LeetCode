package edu.university.leetcode.tree.easy;

import static edu.university.leetcode.tree.easy.P100_SameTree.TreeNode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class P257_BinaryTreePathsTest {
    @Test
    public void binaryTreePaths() throws Exception {
        TreeNode input = new TreeNode(1);
        input.left = new TreeNode(2);
        input.right = new TreeNode(3);
        input.left.right = new TreeNode(5);
        List<String> expected = new ArrayList<>();
        expected.addAll(Arrays.asList("1->2->5", "1->3"));
        List<String> result = P257_BinaryTreePaths.binaryTreePaths(input);
        assertEquals(expected.get(0), result.get(0));
    }

}