package com.wangb.arith.tree.inorder;

import com.wangb.arith.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author wangbin
 * @Date 2020/12/15
 */
public class InorderTraversal94_6 {
    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> valList = new ArrayList<>();
        traversalNode(root, valList);
        return valList;
    }

    private void traversalNode(TreeNode node, List<Integer> valList) {
        if (node == null) {
            return;
        }
        traversalNode(node.left, valList);
        valList.add(node.val);
        traversalNode(node.right, valList);
    }

    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> valList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            valList.add(node.val);
            node = node.right;
        }

        return valList;
    }

}
