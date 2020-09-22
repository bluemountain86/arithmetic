package com.wangb.arith.recursion.maximumdepth;

import com.wangb.arith.tree.TreeNode;

public class MaximumDepthOfBinaryTree104_2 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);

        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }


}
