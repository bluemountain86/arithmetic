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
 * @date 2020-10-02 14:33:37
 */
public class InorderTraversal {

    /**
     * 递归方式二叉树中序遍历
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
     * 递归方式二叉树中序遍历
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

        //中序序遍历在中间步骤把根节点放入输出列表
        nodeList.add(node.val);

        // 调用自己放入右节点
        recursion(node.right, nodeList);
    }

    /**
     * 迭代方式二叉树中序遍历
     *
     * @param root 树跟节点
     * @return 节点值列表
     */
    public List<Integer> iter(TreeNode root) {
        List<Integer> nodeList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            // 节点不为空时把节点压入栈中
            while (root != null) {
                stack.push(root);

                // 持续把当前节点的左节点压入栈中
                root = root.left;
            }

            // 当节点为空，则把最近压入的节点出栈
            root = stack.pop();
            nodeList.add(root.val);

            // 把右节点压入栈中
            root = root.right;
        }

        return nodeList;
    }
}
