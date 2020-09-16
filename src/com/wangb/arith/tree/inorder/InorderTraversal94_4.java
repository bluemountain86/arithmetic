package com.wangb.arith.tree.inorder;

import com.wangb.arith.tree.TreeNode;

import javax.xml.crypto.NodeSetData;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-16 19:44:08
 */
public class InorderTraversal94_4 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> valList = new ArrayList<>();

        Stack<TreeNode> stackNode = new Stack<>();

        TreeNode node = root;

        while (node != null || !stackNode.isEmpty()) {
            while (node != null) {
                stackNode.push(node);
                node = node.left;
            }
            node = stackNode.pop();
            valList.add(node.val);
            node = node.right;
        }

        return valList;
    }
}
