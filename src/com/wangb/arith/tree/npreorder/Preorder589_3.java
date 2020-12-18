package com.wangb.arith.tree.npreorder;

import com.wangb.arith.tree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author wangbin
 * @Date 2020/12/16
 */
public class Preorder589_3 {
    public List<Integer> preorder(Node root) {
        List<Integer> valList = new ArrayList<>();
        if (root == null) {
            return valList;
        }
        recursion(root, valList);
        return valList;
    }

    private void recursion(Node root, List<Integer> valList) {
        if (root == null) {
            return;
        }
        valList.add(root.val);
        for (Node node : root.children) {
            recursion(node, valList);
        }
    }


    public List<Integer> preorder1(Node root) {
        List<Integer> valList = new ArrayList<>();
        if (root == null) {
            return valList;
        }

        LinkedList<Node> stack = new LinkedList<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            valList.add(node.val);
            if (node.children != null) {
                int size = node.children.size();
                for (int i = size - 1; i >= 0; i--) {
                    stack.add(node.children.get(i));
                }
            }
        }
        return valList;
    }
}