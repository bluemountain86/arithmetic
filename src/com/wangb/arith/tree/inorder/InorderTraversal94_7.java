package com.wangb.arith.tree.inorder;

import com.wangb.arith.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author wangbin
 * @Date 2020/12/15
 */
public class InorderTraversal94_7 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> valList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
             root = stack.pop();
            valList.add(root.val);
            root = root.right;
        }
        return valList;
    }
}
