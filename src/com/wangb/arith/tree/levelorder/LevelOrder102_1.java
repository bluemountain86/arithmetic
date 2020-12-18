package com.wangb.arith.tree.levelorder;

import com.wangb.arith.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author wangbin
 * @Date 2020/12/17
 */
public class LevelOrder102_1 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> valList = new ArrayList<>();
        if (root == null) {
            return valList;
        }
        Queue<TreeNode> subNode = new LinkedList<>();
        subNode.add(root);
        while (!subNode.isEmpty()) {
            List<Integer> tmpList = new ArrayList<>();
            int size = subNode.size();
            for (int i = 0; i < size; i++) {
                TreeNode tmpNode = subNode.poll();
                tmpList.add(tmpNode.val);
                if (tmpNode.left != null) {
                    subNode.add(tmpNode.left);
                }
                if (tmpNode.right != null) {
                    subNode.add(tmpNode.right);
                }
            }
            valList.add(tmpList);
        }
        return valList;
    }
}
