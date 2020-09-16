package com.wangb.arith.arry.removeduplicates;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-16 19:44:08
 */
public class RemoveDuplicates26_1 {
    public int removeDuplicates(int[] nums) {
        int len = 0;
        if (nums == null || nums.length == 0) {
            return len;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] != nums[i - 1]) {
                continue;
            } else {
                nums[len] = nums[i];
                len++;
            }
        }

        return len;
    }

    @Test
    public void testRemoveDuplicates() {
        int[] nums = new int[]{1, 1, 2};
        int len = removeDuplicates(nums);
        System.out.println(Arrays.toString(Arrays.copyOf(nums, len)));
        nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        len = removeDuplicates(nums);
        System.out.println(Arrays.toString(Arrays.copyOf(nums, len)));
    }
}