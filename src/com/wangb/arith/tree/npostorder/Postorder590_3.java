package com.wangb.arith.tree.npostorder;

import com.wangb.arith.tree.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wangbin
 * @Date 2020/12/16
 */
public class Postorder590_3 {
    public List<Integer> postOrder(Node root) {
        List<Integer> valList = new ArrayList<>();
        recursion(root, valList);
        return valList;
    }

    private void recursion(Node root, List<Integer> valList) {
        if (root == null) {
            return;
        }
        for (Node node : root.children) {
            recursion(node, valList);
        }
        valList.add(root.val);
    }


}
