package com.wangb.arith.tree.levelorderbottom;

import com.wangb.arith.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author wangbin
 * @Date 2020/12/27
 */
public class LevelOrderBottom107_1 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
//        List<List<Integer>> resultList = new ArrayList<>();
        LinkedList<List<Integer>> resultList = new LinkedList<>();
        if (root == null) {
            return resultList;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> tmpList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode tmpNode = queue.poll();
                tmpList.add(tmpNode.val);
                if (tmpNode.left != null) {
                    queue.add(tmpNode.left);
                }
                if (tmpNode.right != null) {
                    queue.add(tmpNode.right);
                }
            }
            resultList.addFirst(tmpList);
        }

        return resultList;
    }
}
