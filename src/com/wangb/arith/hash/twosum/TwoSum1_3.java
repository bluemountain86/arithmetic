package com.wangb.arith.hash.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1_3 {
    public int[] twoSum1(int[] nums, int target) {
        int[] indexs = new int[2];
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            indexMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (indexMap.containsKey(key) && indexMap.get(key) != i) {
                indexs[0] = i;
                indexs[1] = indexMap.get(key);
                break;
            }
        }

        return indexs;
    }

    public int[] twoSum2(int[] nums, int target) {
        int[] indexs = new int[2];
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (indexMap.containsKey(key)) {
                indexs[0] = indexMap.get(key);
                indexs[1] = i;
                break;
            } else {
                indexMap.put(nums[i], i);
            }
        }

        return indexs;
    }
}
