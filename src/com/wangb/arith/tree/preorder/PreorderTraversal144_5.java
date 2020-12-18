package com.wangb.arith.tree.preorder;

import com.wangb.arith.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author wangbin
 * @Date 2020/12/16
 */
public class PreorderTraversal144_5 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> valList = new ArrayList<>();
        recursion(root, valList);
        return valList;
    }

    private void recursion(TreeNode root, List<Integer> valList) {
        if (root == null) {
            return;
        }
        valList.add(root.val);
        recursion(root.left, valList);
        recursion(root.right, valList);
    }

    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> valList = new ArrayList<>();
        if (root == null) {
            return valList;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            valList.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return valList;
    }

}
