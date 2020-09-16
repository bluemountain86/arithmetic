package com.wangb.arith.recursion.validbst;

import com.wangb.arith.tree.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-13 21:50:47
 */
public class Validbst98_1 {
    public boolean isValidBST1(TreeNode root) {
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

    public boolean isValidBST2(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        double inorder = -Double.MAX_VALUE;
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.val <= inorder) {
                return false;
            }
            inorder = root.val;
            root = root.right;
        }
        return true;
    }

}
