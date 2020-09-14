package com.wangb.arith.tree.npostorder;

import com.wangb.arith.tree.Node;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-12 22:25:04
 */
public class Postorder590_1 {

    public List<Integer> postOrder1(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        addToList(list, root);
        return list;
    }

    public void addToList(List<Integer> list, Node node) {
        if (node != null) {
            if (node.children != null) {
                for (Node child : node.children) {
                    addToList(list, child);
                }
            }
            list.add(node.val);
        }
    }

    @Test
    public void testPreorderTraversal2() {
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

        System.out.println(postOrder1(node));
    }
}
