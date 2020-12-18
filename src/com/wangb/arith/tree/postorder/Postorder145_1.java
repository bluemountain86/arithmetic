package com.wangb.arith.tree.postorder;

import com.wangb.arith.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author wangbin
 * @Date 2020/12/17
 */
public class Postorder145_1 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> valList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null ) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
        }

        return valList;
    }
}
