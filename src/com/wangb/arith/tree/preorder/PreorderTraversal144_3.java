package com.wangb.arith.tree.preorder;

import com.wangb.arith.tree.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversal144_3 {
    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> valList = new ArrayList<>();
        addValToList(root, valList);
        return valList;
    }

    private void addValToList(TreeNode node, List<Integer> valList) {
        if (node == null) {
            return;
        }
        valList.add(node.val);
        addValToList(node.left, valList);
        addValToList(node.right, valList);
    }

    @Test
    public void testPreorderTraversal1() {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(preorderTraversal1(root));
    }

    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> valList = new ArrayList<>();
        if (root == null) {
            return valList;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        stack.add(node);
        while (!stack.isEmpty()) {
            node = stack.pop();
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

    @Test
    public void testPreorderTraversal2() {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(preorderTraversal2(root));
    }
}
