package com.wangb.arith.tree.levelorder;

import com.wangb.arith.tree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author wangbin
 * @Date 2020/12/14
 */
public class Levelorder429_3 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> valLists = new ArrayList<>();

        if (root == null) {
            return valLists;
        }

        LinkedList<Node> currNodeList = new LinkedList<>();
        currNodeList.add(root);
        while (!currNodeList.isEmpty()) {
            List<Integer> valList = new ArrayList<>();
            int size = currNodeList.size();
            for (int i = 0; i < size; i++) {
                Node tmpNode = currNodeList.poll();
                valList.add(tmpNode.val);
                if (tmpNode.children != null) {
                    currNodeList.addAll(tmpNode.children);
                }
            }
            valLists.add(valList);
        }

        return valLists;
    }

}
