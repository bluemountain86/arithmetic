package com.wangb.arith.recursion.validbst;

import com.wangb.arith.tree.TreeNode;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-13 21:50:47
 */
public class validbst98_1 {
    public boolean isValidBST(TreeNode root) {
        return compareTreeNode(root, null, null);
    }

    public boolean compareTreeNode(TreeNode node, Integer lower, Integer upper) {
        if (node == null) {
            return true;
        }

        int val = node.val;
        if (lower != null && val <= lower) {
            return false;
        }
        if (upper != null && val >= upper) {
            return false;
        }
        if (!compareTreeNode(node.left, lower, val)) {
            return false;
        }
        if (!compareTreeNode(node.right, val, upper)) {
            return false;
        }
        return true;
    }


}
