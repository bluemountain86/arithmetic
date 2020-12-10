package com.wangb.arith.recursion.maximumdepth;

import com.wangb.arith.tree.TreeNode;

/**
 * @Author wangbin
 * @Date 2020/12/10
 */
public class MaximumDepthOfBinaryTree104_5 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left) + 1;

        int right = maxDepth(root.right) + 1;

        return Math.max(left, right);
    }
}
