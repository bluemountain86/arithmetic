package com.wangb.arith.hash.twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author wangbin
 * @Date 2021/1/24
 */
public class TwoSum1_6 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] index = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int sub = target - num;
            if (map.containsKey(sub)) {
                index[0] = map.get(sub);
                index[1] = i;
            } else {
                map.put(nums[i], i);
            }
        }
        return index;
    }
}
