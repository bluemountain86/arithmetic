package com.wangb.arith.recursion.permute;

import java.util.ArrayList;
import java.util.List;

public class Permute46_1 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return resultList;
        }

        return resultList;
    }

    private void permute(int level, int maxleve, int[] nums, List<Integer> tmpList, List<List<Integer>> resultList) {
        if (level == nums.length) {
            resultList.add(tmpList);
            return;
        }
        for (int i = 0; i < nums.length; i++) {

        }
    }
}
