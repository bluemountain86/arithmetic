package com.wangb.arith.tree.template.tree;

import com.wangb.arith.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树后序遍历
 *
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-10-01 23:18:22
 */
public class PostorderTraversal {


    /**
     * 递归方式二叉树后序遍历
     *
     * @param root 树根节点
     * @return 输出遍历节点
     */
    public List<Integer> recursion(TreeNode root) {
        List<Integer> nodeList = new ArrayList<>();
        recursion(root, nodeList);
        return nodeList;
    }

    /**
     * 递归方式二叉树后序遍历
     *
     * @param node     树跟节点
     * @param nodeList 节点值列表
     */
    private void recursion(TreeNode node, List<Integer> nodeList) {
        if (node == null) {
            return;
        }

        // 调用自己放入左节点
        recursion(node.left, nodeList);

        //调用自己最后放入右节点
        recursion(node.right, nodeList);

        //后序遍历最后把根节点放入输出列表
        nodeList.add(node.val);
    }

    /**
     * 迭代方式二叉树后序遍历
     *
     * @param root 树跟节点
     * @return 节点值列表
     */
    public List<Integer> iter(TreeNode root) {
        List<Integer> nodeList = new ArrayList<>();
        if (root == null) {
            return nodeList;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode prev = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.right == null || root.right == prev) {
                nodeList.add(root.val);
                prev = root;
                root = null;
            } else {
                stack.push(root);
                root = root.right;
            }
        }

        return nodeList;
    }

}
