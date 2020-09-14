package com.wangb.arith.tree.levelorder;

import com.wangb.arith.tree.Node;
import org.junit.Test;

import java.util.*;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-13 16:28:05
 */
public class Levelorder429_2 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> levelResult = new ArrayList<List<Integer>>();
        if (root == null) {
            return levelResult;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> valList = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                valList.add(node.val);
                if (node.children != null) {
                    queue.addAll(node.children);
                }
            }
            levelResult.add(valList);
        }
        return levelResult;
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

        System.out.println(levelOrder(node));
    }
}
