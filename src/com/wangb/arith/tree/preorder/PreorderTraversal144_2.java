package com.wangb.arith.tree.preorder;

import com.wangb.arith.tree.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-13 15:19:20
 */
public class PreorderTraversal144_2 {
    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        if (root == null) {
            return resultList;
        }

        addValToList(resultList, root);

        return resultList;
    }

    private void addValToList(List<Integer> resultList, TreeNode root) {
        if (root != null) {
            resultList.add(root.val);
            if (root.left != null) {
                addValToList(resultList, root.left);
            }
            if (root.right != null) {
                addValToList(resultList, root.right);
            }
        }
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
        List<Integer> resultList = new ArrayList<>();
        if (root == null) {
            return resultList;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();

        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            resultList.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return resultList;
    }
}
