package com.wangb.arith.hash.twosum;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1_1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i], i);
        }
        int[] indexes = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int subValue = target - nums[i];
            if (numMap.containsKey(subValue)) {
                int index = numMap.get(subValue);
                if (i != index) {
                    indexes[0] = i;
                    indexes[1] = index;
                    return indexes;
                }
            }
        }
        return indexes;
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (numMap.containsKey(target - nums[i])) {
                int index = numMap.get(target - nums[i]);
                if (i != index) {
                    return new int[]{index, i};
                }
            } else {
                numMap.put(nums[i], i);
            }
        }
        return null;
    }

    @Test
    public void testTwoSum() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println("nums:" + Arrays.toString(nums) + ", target" + target);
        System.out.println(Arrays.toString(twoSum(nums, target)));

        nums = new int[]{2, 11, 7, 15};
        target = 9;
        System.out.println("nums:" + Arrays.toString(nums) + ", target" + target);
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    @Test
    public void testTwoSum2() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println("nums:" + Arrays.toString(nums) + ", target" + target);
        System.out.println(Arrays.toString(twoSum(nums, target)));

        nums = new int[]{2, 11, 7, 15};
        target = 9;
        System.out.println("nums:" + Arrays.toString(nums) + ", target" + target);
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
