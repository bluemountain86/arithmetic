package com.wangb.arith.recursion.minimumdepth;

import com.wangb.arith.tree.TreeNode;

public class MinimumDepthOfBinaryTree111_2 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if (left == 0 || right == 0) {
            return left + right + 1;
        }
        return Math.min(left, right) + 1;
    }
}
