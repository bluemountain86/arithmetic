package com.wangb.arith.tree.preorder;

import com.wangb.arith.tree.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-12 17:31:37
 */
public class PreorderTraversal144_1 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        addNodeToList(root, list);
        return list;
    }

    public void addNodeToList(TreeNode root, List<Integer> list) {
        if (root != null) {
            list.add(root.val);
            if (root.left != null) {
                addNodeToList(root.left, list);
            }
            if (root.right != null) {
                addNodeToList(root.right, list);
            }
        }
    }

    @Test
    public void testPreorderTraversal1() {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(preorderTraversal(root));
    }

    public List<Integer> prorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        if (root == null) {
            return list;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pollLast();
            list.add(node.val);
            if(node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                stack.add(node.left);
            }
        }
        return list;
    }

    @Test
    public void testPreorderTraversal2() {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(prorderTraversal2(root));
    }
}
