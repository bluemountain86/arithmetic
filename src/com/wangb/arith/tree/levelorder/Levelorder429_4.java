package com.wangb.arith.tree.levelorder;

import com.wangb.arith.tree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author wangbin
 * @Date 2020/12/15
 */
public class Levelorder429_4 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> valList = new ArrayList<>();
        if (root == null) {
            return valList;
        }
        LinkedList<Node> nodeList = new LinkedList<>();
        nodeList.add(root);
        while (!nodeList.isEmpty()) {
            List<Integer> tmpList = new ArrayList<>();
            int len = nodeList.size();
            for (int i = 0; i < len; i++) {
                Node tmpNode = nodeList.poll();
                tmpList.add(tmpNode.val);
                if (tmpNode.children != null) {
                    nodeList.addAll(tmpNode.children);
                }
            }
            valList.add(tmpList);
        }
        return valList;
    }

    public List<List<Integer>> levelOrder2(Node root) {
        List<List<Integer>> valList = new ArrayList<>();
        if (root == null) {
            return valList;
        }
        LinkedList<Node> nodeList = new LinkedList<>();
        nodeList.add(root);
        recursion(nodeList, valList);
        return valList;
    }

    private void recursion(LinkedList<Node> nodeList, List<List<Integer>> valList) {
        if (nodeList.isEmpty()) {
            return;
        }
        List<Integer> tmpList = new ArrayList<>();
        int len = nodeList.size();
        for (int i = 0; i < len; i++) {
            Node tmpNode = nodeList.poll();
            if (tmpNode != null) {
                tmpList.add(tmpNode.val);
                nodeList.addAll(tmpNode.children);
            }
        }
        valList.add(tmpList);
        recursion(nodeList, valList);
    }
}
