package com.wangb.arith.tree.preorder;

import com.wangb.arith.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author wangbin
 * @Date 2020/12/17
 */
public class PreorderTraversal144_6 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> valList = new ArrayList<>();
        if (root == null) {
            return valList;
        }
        Stack<TreeNode> queue = new Stack<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.pop();
            valList.add(node.val);
            if (node.right != null) {
                queue.push(node.right);
            }
            if (node.left != null) {
                queue.push(node.left);
            }
        }

        return valList;
    }

}
