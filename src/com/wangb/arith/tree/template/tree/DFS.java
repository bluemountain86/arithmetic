package com.wangb.arith.tree.template.tree;

import com.wangb.arith.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class DFS {

    /**
     * 深度优先二叉树遍历
     *
     * @param root 树跟节点
     * @return 节点值列表
     */
    public List<List<Integer>> dfs(TreeNode root) {
        List<List<Integer>> resultList = new ArrayList<>();
        if (root == null) {
            return resultList;
        }
        return resultList;
    }

    private void travel(TreeNode node, int level, List<List<Integer>> resultList) {
        if (resultList.size() == level) {
            resultList.add(new ArrayList<>());
        }
        resultList.get(level).add(node.val);
        if (node.left != null) {
            travel(node.left, level + 1, resultList);
        }
        if (node.right != null) {
            travel(node.right, level + 1, resultList);
        }
    }
}
