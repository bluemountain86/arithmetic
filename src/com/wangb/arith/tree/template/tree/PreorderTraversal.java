package com.wangb.arith.tree.template.tree;

import com.wangb.arith.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树前序遍历
 *
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-10-01 23:18:22
 */
public class PreorderTraversal {


    /**
     * 递归方式二叉树前序遍历
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
     * 递归方式二叉树前序遍历
     *
     * @param node     树跟节点
     * @param nodeList 节点值列表
     */
    private void recursion(TreeNode node, List<Integer> nodeList) {
        if (node == null) {
            return;
        }

        //前序遍历先把根节点放入输出列表
        nodeList.add(node.val);

        // 调用自己放入左节点
        recursion(node.left, nodeList);

        //调用自己最后放入右节点
        recursion(node.right, nodeList);
    }

    /**
     * 迭代方式二叉树前序遍历
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

        // 根节点进入栈
        stack.push(root);
        while (!stack.isEmpty()) {

            // 前序遍历优先父节点出栈
            TreeNode node = stack.pop();
            nodeList.add(node.val);

            // 栈是后进先出，右子节点先进栈，出栈顺序排在左节点之后
            if (node.right != null) {
                stack.push(node.right);
            }

            // 栈是后进先出，左子节点后进栈，出栈顺序排在右节点之前
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return nodeList;
    }
}
