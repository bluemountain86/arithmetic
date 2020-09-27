package com.wangb.arith.hash.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1_4 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> subMap = new HashMap<Integer, Integer>();
        int sub = 0;
        int[] indexs = new int[2];
        for (int i = 0; i < nums.length; i++) {
            sub = target - nums[i];
            if (subMap.containsKey(sub)) {
                indexs[0] = subMap.get(sub);
                indexs[1] = i;
                return indexs;
            }
            subMap.put(nums[i], i);
        }
        return indexs;
    }

}
