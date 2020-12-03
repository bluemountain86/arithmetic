package com.wangb.arith.arry.sum3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3Nums15_5 {
    public List<List<Integer>> sum3Nums(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();

        if (nums == null || nums.length < 3) {
            return resultList;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (k > j) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                    while (k > j && nums[j - 1] == nums[j]) {
                        j++;
                    }
                } else if (sum == 0) {

                    List<Integer> tmpList = new ArrayList<>();
                    tmpList.add(nums[i]);
                    tmpList.add(nums[j]);
                    tmpList.add(nums[k]);
                    resultList.add(tmpList);
                    j++;
                    while (k > j && nums[j - 1] == nums[j]) {
                        j++;
                    }
                    k--;
                    while (k > j && nums[k + 1] == nums[k]) {
                        k--;
                    }
                } else {
                    k--;
                    while (k > j && nums[k + 1] == nums[k]) {
                        k--;
                    }
                }
            }
        }

        return resultList;
    }
}
