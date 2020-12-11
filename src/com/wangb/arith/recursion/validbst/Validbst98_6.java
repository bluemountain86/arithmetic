package com.wangb.arith.recursion.validbst;

import com.wangb.arith.tree.TreeNode;

/**
 * @Author wangbin
 * @Date 2020/12/11
 */
public class Validbst98_6 {
    public boolean isValidBST(TreeNode root) {
        return compareVal(root, null, null);
    }

    public boolean compareVal(TreeNode node, Integer lower, Integer upper) {
        if (node == null) {
            return true;
        }

        int val = node.val;

        if (lower != null && lower >= val) {
            return false;
        }
        if (upper != null && upper <= val) {
            return false;
        }
        if (!compareVal(node.left, lower, val)) {
            return false;
        }
        if (!compareVal(node.right, val, upper)) {
            return false;
        }
        return true;
    }
}
