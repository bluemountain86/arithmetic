package com.wangb.arith.recursion.subsets;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wangbin
 * @Date 2020/12/11
 */
public class SubSets78_4 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        if (nums == null) {
            return resultList;
        }
        List<Integer> subList = new ArrayList<>();
        generateSet(0, nums, subList, resultList);
        return resultList;
    }

    private void generateSet(int level, int[] nums, List<Integer> subList, List<List<Integer>> resultList) {
        if (level == nums.length) {
            resultList.add(new ArrayList<>(subList));
            return;
        }
        generateSet(level, nums, subList, resultList);
        subList.add(nums[level]);
        generateSet(level + 1, nums, subList, resultList);
        subList.remove(subList.size() - 1);
    }

}
