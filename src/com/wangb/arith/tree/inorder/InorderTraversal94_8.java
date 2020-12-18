package com.wangb.arith.tree.inorder;

import com.wangb.arith.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author wangbin
 * @Date 2020/12/17
 */
public class InorderTraversal94_8 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> valList = new ArrayList<>();
        if (root == null) {
            return valList;
        }
        Stack<TreeNode> queue = new Stack<>();
        while (root != null || !queue.isEmpty()) {
            while (root != null) {
                queue.push(root);
                root = root.left;
            }
            TreeNode node = queue.pop();
            valList.add(node.val);
            root = node.right;
        }

        return valList;
    }
}
