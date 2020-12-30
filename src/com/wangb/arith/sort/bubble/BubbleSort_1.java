package com.wangb.arith.sort.bubble;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author wangbin
 * @Date 2020/12/30
 */
public class BubbleSort_1 {
    public int[] bubbleSort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return nums;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = tmp;
                }
            }
        }
        return nums;
    }

    @Test
    public void testBubbleSort() {
        int[] nums = {9, 98, 1, 3, 6, 54, 89, 2, 501, 5, 98, 12};
        System.out.println(Arrays.toString(bubbleSort(nums)));
    }
}
