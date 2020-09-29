package com.wangb.arith.tree.invertbinarytree;

import com.wangb.arith.tree.TreeNode;

public class InvertBinaryTree226_2 {
    public TreeNode invertTree(TreeNode root) {
        swapTreeNode(root);
        return root;
    }

    private void swapTreeNode(TreeNode node) {
        if (node == null) {
            return;
        }

        TreeNode tmpNode = node.left;
        node.left = node.right;
        node.right = tmpNode;
        swapTreeNode(node.left);
        swapTreeNode(node.right);
    }
}
