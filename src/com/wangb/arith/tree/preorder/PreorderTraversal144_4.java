package com.wangb.arith.tree.preorder;

import com.wangb.arith.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-16 19:44:08
 */
public class PreorderTraversal144_4 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> valList = new ArrayList<>();
        if (root == null) {
            return valList;
        }
        Stack<TreeNode> stackNode = new Stack<>();
        stackNode.push(root);
        while (!stackNode.isEmpty()) {
            TreeNode node = stackNode.pop();
            valList.add(node.val);
            if (node.right != null) {
                stackNode.push(node.right);
            }
            if (node.left != null) {
                stackNode.push(node.left);
            }
        }

        return valList;
    }
}
