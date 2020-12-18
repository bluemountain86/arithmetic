package com.wangb.arith.tree.template.tree;

import com.wangb.arith.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    /**
     * 广度优先二叉树遍历
     *
     * @param root 树跟节点
     * @return 节点值列表
     */
    public List<Integer> recursion(TreeNode root) {
        List<Integer> valList = new ArrayList<>();
        Queue<TreeNode> queueNode = new LinkedList<>();
        queueNode.add(root);
        recursion(queueNode, valList);
        return valList;
    }

    private void recursion(Queue<TreeNode> queueNode, List<Integer> valList) {
        if (queueNode.isEmpty()) {
            return;
        }
        int size = queueNode.size();
        for (int i = 0; i < size; i++) {
            TreeNode node = queueNode.poll();
            valList.add(node.val);
            if (node.left != null) {
                queueNode.add(node.left);
            }
            if (node.right != null) {
                queueNode.add(node.right);
            }
        }

        recursion(queueNode, valList);
    }

    /**
     * 迭代广度优先二叉树遍历
     *
     * @param root 树跟节点
     * @return 节点值列表
     */
    public List<Integer> iter(TreeNode root) {
        List<Integer> valList = new ArrayList<>();
        if (root == null) {
            return valList;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            valList.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return valList;
    }

}
