package com.wangb.arith.tree.npreorder;

import com.wangb.arith.tree.Node;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-13 16:16:53
 */
public class Preorder589_2 {
    public List<Integer> preorder1(Node root) {
        List<Integer> resultList = new ArrayList<Integer>();
        if (root == null) {
            return resultList;
        }
        addValToList(resultList, root);
        return resultList;
    }

    private void addValToList(List<Integer> resultList, Node node) {
        if (node != null) {
            resultList.add(node.val);
            if (node.children != null) {
                for (Node child : node.children) {
                    addValToList(resultList, child);
                }
            }
        }
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

        System.out.println(preorder1(node));
    }
}
