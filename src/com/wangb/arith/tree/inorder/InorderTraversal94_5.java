package com.wangb.arith.tree.inorder;

import com.wangb.arith.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author wangbin
 * @Date 2020/12/14
 */
public class InorderTraversal94_5 {
    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> nodeList = new ArrayList<>();
        if (root == null) {
            return nodeList;
        }
        traversal(root, nodeList);
        return nodeList;
    }

    private void traversal(TreeNode node, List<Integer> nodeList) {
        if (node == null) {
            return;
        }
        traversal(node.left, nodeList);
        nodeList.add(node.val);
        traversal(node.right, nodeList);
    }

    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> nodeList = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            nodeList.add(node.val);
            node = node.right;
        }

        return nodeList;
    }
}
