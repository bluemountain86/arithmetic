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
 * @date 2020-09-12 16:56:21
 */
public class InorderTraversal94_1 {

    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        addNodeToList(root, list);
        return list;
    }

    public void addNodeToList(TreeNode root, List<Integer> list) {
        if (root != null) {
            if (root.left != null) {
                addNodeToList(root.left, list);
            }
            list.add(root.val);
            if (root.right != null) {
                addNodeToList(root.right, list);
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
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node  = root;
        while(node != null || !stack.isEmpty() ) {

            while(node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            list.add(node.val);
            node = node.right;
        }
        return list;
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
