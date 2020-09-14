package com.wangb.arith.tree.levelorder;

import com.wangb.arith.tree.Node;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-12 23:01:55
 */
public class Levelorder429_1 {
    public List<List<Integer>> levelorder(Node root) {
        List<List<Integer>> levelList = new ArrayList<List<Integer>>();
        if (root == null) {
            return levelList;
        }

        Queue<Node> nodeList = new LinkedList<>();
        nodeList.add(root);
        while (!nodeList.isEmpty()) {
            List<Integer> tmpList = new ArrayList<Integer>();
            int size = nodeList.size();
            for (int i = 0; i < size; i++) {
                Node node = nodeList.poll();
                tmpList.add(node.val);
                if (node.children != null) {
                    nodeList.addAll(node.children);
                }
            }
            levelList.add(tmpList);
        }

        return levelList;
    }

    @Test
    public void testPreorderTraversal1() {
        Node node = new Node(1);
        List<Node> nodeChild = new ArrayList<>();
        node.children = nodeChild;

        Node node1 = new Node(3);
        Node node2 = new Node(2);
        Node node3 = new Node(4);
        nodeChild.add(node1);
        nodeChild.add(node2);
        nodeChild.add(node3);

        List<Node> node1Child = new ArrayList<>();
        node1Child.add(new Node(5));
        node1Child.add(new Node(6));
        node1.children = node1Child;

        System.out.println(levelorder(node));
    }
}
