package com.wangb.arith.recursion.subsets;

import com.wangb.arith.arry.sum3.Sum3Nums15_1;

import java.util.ArrayList;
import java.util.List;

public class SubSets78_3 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        if (nums == null) {
            return subsets;
        }
        dfs(nums, subsets, new ArrayList<Integer>(), 0);
        return subsets;
    }

    public void dfs(int[] nums, List<List<Integer>> subsets, List<Integer> tmpList, int i) {
        if (i == nums.length) {
            subsets.add(new ArrayList<>(tmpList));
            return;
        }
        dfs(nums, subsets, tmpList, i + 1);
        tmpList.add(nums[i]);
        dfs(nums, subsets, tmpList, i + 1);
        tmpList.remove(tmpList.size() - 1);
    }

}
