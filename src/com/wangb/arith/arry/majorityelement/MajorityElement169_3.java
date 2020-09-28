package com.wangb.arith.arry.majorityelement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-28 22:20:21
 */
public class MajorityElement169_3 {
    public int majorityElemen1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public int majorityElemen2(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            if (counter.containsKey(num)) {
                counter.put(num, counter.get(num) + 1);
            } else {
                counter.put(num, 1);
            }
        }
        Map.Entry<Integer, Integer> max = null;
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            if (max == null || entry.getValue() > max.getValue()) {
                max = entry;
            }
        }
        return max.getKey();
    }
}
