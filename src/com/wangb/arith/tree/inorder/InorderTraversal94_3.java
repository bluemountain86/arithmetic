package com.wangb.arith.tree.inorder;

import com.wangb.arith.tree.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal94_3 {
    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> valList = new ArrayList<>();
        addValToList(root, valList);
        return valList;
    }

    private void addValToList(TreeNode node, List<Integer> valList) {
        if (node == null) {
            return;
        }
        addValToList(node.left, valList);
        valList.add(node.val);
        addValToList(node.right, valList);
    }

    @Test
    public void testInorderTraversal1() {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(inorderTraversal1(root));
    }

    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> valList = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<TreeNode>();

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

    @Test
    public void testInorderTraversal2() {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(inorderTraversal2(root));
    }

}
