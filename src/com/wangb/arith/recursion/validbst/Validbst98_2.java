package com.wangb.arith.recursion.validbst;

import com.wangb.arith.tree.TreeNode;

public class Validbst98_2 {
    public boolean isValidBST(TreeNode root) {
        return compareNodeVal(root, null, null);
    }

    public boolean compareNodeVal(TreeNode node, Integer left, Integer right) {

        if (node == null) {
            return true;
        }

        int val = node.val;

        if (left != null && left >= val) {
            return false;
        }

        if (right != null && val >= right) {
            return false;
        }

        if (!compareNodeVal(node.left, left, val)) {
            return false;
        }

        if (!compareNodeVal(node.right, val, right)) {
            return false;
        }

        return true;
    }
}
