package com.wangb.arith.recursion.minimumdepth;

import com.wangb.arith.tree.TreeNode;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-28 23:03:45
 */
public class MinimumDepthOfBinaryTree111_3 {
    public int minDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }

        int left = minDepth1(root.left);
        int right = minDepth1(root.right);
        if (left == 0 || right == 0) {
            return left + right + 1;
        }
        return Math.min(left, right);
    }

    public int minDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }

        int minDepth = Integer.MAX_VALUE;

        if (root.left != null) {
            minDepth = Math.min(minDepth2(root.left), minDepth);
        }

        int right = Integer.MAX_VALUE;
        if (root.right != null) {
            minDepth = Math.min(minDepth2(root.right), minDepth);
        }

        return minDepth + 1;
    }
}
