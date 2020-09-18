package com.wangb.arith.tree.invertbinarytree;

import com.sun.prism.sw.SWPipeline;
import com.wangb.arith.tree.TreeNode;

public class InvertBinaryTree266_1 {
    public TreeNode invertTree(TreeNode root) {
        swap(root);
        return root;
    }

    public void swap(TreeNode node) {
        if (node == null) {
            return;
        }

        TreeNode tmp = node.right;
        node.right = node.left;
        node.left = tmp;

        swap(node.left);
        swap(node.right);
    }

}
