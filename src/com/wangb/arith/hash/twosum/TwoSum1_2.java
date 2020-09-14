package com.wangb.arith.hash.twosum;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-12 15:59:42
 */
public class TwoSum1_2 {
    public int[] twoSum1(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return null;
        }
        int[] indexs = new int[2];
        Map<Integer, Integer> mapIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            mapIndex.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int subInt = target - nums[i];
            if (mapIndex.containsKey(subInt) && !mapIndex.get(subInt).equals(i)) {
                indexs[0] = i;
                indexs[1] = mapIndex.get(subInt);
                break;
            }
        }
        return indexs;
    }

    @Test
    public void testTwoSum1() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println("nums:" + Arrays.toString(nums) + ", target:" + target);
        System.out.println(Arrays.toString(twoSum1(nums, target)));

        nums = new int[]{2, 11, 7, 15};
        target = 9;
        System.out.println("nums:" + Arrays.toString(nums) + ", target:" + target);
        System.out.println(Arrays.toString(twoSum1(nums, target)));
    }

    public int[] twoSum2(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return null;
        }
        int[] indexs = new int[2];
        Map<Integer, Integer> mapIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int subInt = target - nums[i];
            if (mapIndex.containsKey(subInt)) {
                indexs[0] = mapIndex.get(subInt);
                indexs[1] = i;
                break;
            } else {
                mapIndex.put(nums[i], i);
            }
        }
        return indexs;
    }

    @Test
    public void testTwoSum2() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println("nums:" + Arrays.toString(nums) + ", target:" + target);
        System.out.println(Arrays.toString(twoSum1(nums, target)));

        nums = new int[]{2, 11, 7, 15};
        target = 9;
        System.out.println("nums:" + Arrays.toString(nums) + ", target:" + target);
        System.out.println(Arrays.toString(twoSum1(nums, target)));
    }
}
