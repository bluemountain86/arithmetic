package com.wangb.arith.hash.twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author wangbin
 * @Date 2020/12/8
 */
public class TwoSum1_5 {
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int sub = target - nums[i];
            if (map.containsKey(sub) && map.get(sub) != i) {
                index[0] = i;
                index[1] = map.get(sub);
                break;
            }
        }
        return index;
    }
}
