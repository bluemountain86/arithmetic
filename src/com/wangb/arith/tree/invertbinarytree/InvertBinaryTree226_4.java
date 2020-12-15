package com.wangb.arith.tree.invertbinarytree;

import com.wangb.arith.tree.TreeNode;

/**
 * @Author wangbin
 * @Date 2020/12/15
 */
public class InvertBinaryTree226_4 {
    public TreeNode invertTree(TreeNode root) {
        TreeNode node = root;
        swap(root);
        return node;
    }

    private void swap(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode tmpLeft = root.left;
        root.left = root.right;
        root.right = tmpLeft;
        swap(root.left);
        swap(root.right);
    }
}
