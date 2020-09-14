package com.wangb.arith.tree.inorder;

import com.wangb.arith.tree.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-13 14:13:05
 */
public class InorderTraversal94_2 {
    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        addValToList(list, root);
        return list;
    }

    public void addValToList(List<Integer> list, TreeNode node) {
        if (node != null) {
            if (node.left != null) {
                addValToList(list, node.left);
            }
            list.add(node.val);

            if (node.right != null) {
                addValToList(list, node.right);
            }
        }
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
        List<Integer> resultList = new ArrayList<>();
        if (root == null) {
            return resultList;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            resultList.add(node.val);
            node = node.right;
        }
        return resultList;
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
