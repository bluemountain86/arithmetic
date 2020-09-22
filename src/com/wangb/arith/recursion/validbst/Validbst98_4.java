package com.wangb.arith.recursion.validbst;

import com.wangb.arith.tree.TreeNode;

public class Validbst98_4 {
    public boolean isValidBST(TreeNode root) {
        return compareVal(root, null, null);
    }

    public boolean compareVal(TreeNode node, Integer left, Integer right) {
        if (node == null) {
            return true;
        }

        int val = node.val;

        if (left != null && val <= left) {
            return false;
        }

        if (right != null && val >= right) {
            return false;
        }

        if (!compareVal(node.left, left, val)) {
            return false;
        }

        if (!compareVal(node.right, val, right)) {
            return false;
        }

        return true;
    }
}
