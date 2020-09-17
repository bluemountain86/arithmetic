package com.wangb.arith.recursion.validbst;

import com.wangb.arith.tree.TreeNode;

import java.util.Stack;

public class Validbst98_3 {
    public boolean isValidBST(TreeNode root) {
        return compareTreeNodeVal(root, null, null);
    }

    private boolean compareTreeNodeVal(TreeNode node, Integer lower, Integer upper) {

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

        if (!compareTreeNodeVal(node.left, lower, val)) {
            return false;
        }
        if (!compareTreeNodeVal(node.right, val, upper)) {
            return false;
        }
        return true;
    }

    public boolean isValidBST2(TreeNode root) {
        Stack<TreeNode> stackNode = new Stack<>();
        TreeNode node = root;
        long rootVal = Long.MIN_VALUE;
        while (node != null || !stackNode.isEmpty()) {
            while (node != null) {
                stackNode.push(node);
                node = node.left;
            }
            node = stackNode.pop();
            if (node.val <= rootVal) {
                return false;
            }
            rootVal = node.val;
            node = node.right;
        }
        return true;
    }
}
