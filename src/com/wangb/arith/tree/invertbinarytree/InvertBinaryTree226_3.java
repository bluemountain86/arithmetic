package com.wangb.arith.tree.invertbinarytree;

import com.wangb.arith.tree.TreeNode;

/**
 * @Author wangbin
 * @Date 2020/12/14
 */
public class InvertBinaryTree226_3 {
    public TreeNode invertTree(TreeNode root) {
        TreeNode node = root;
        swap(node);
        return node;
    }

    public void swap(TreeNode node) {
        if (node == null) {
            return;
        }
        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;
        swap(node.left);
        swap(node.right);
    }
}
