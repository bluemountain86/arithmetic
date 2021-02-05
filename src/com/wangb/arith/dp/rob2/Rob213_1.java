package com.wangb.arith.dp.rob2;

import java.util.Arrays;

/**
 * @Author wangbin
 * @Date 2021/2/5
 */
public class Rob213_1 {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        if (nums.length < 2) {
            return nums[0];
        }
        return Math.max(myRob(Arrays.copyOfRange(nums, 0, nums.length - 1)), myRob(Arrays.copyOfRange(nums, 1, nums.length)));
    }

    private int myRob(int[] nums) {
        int prev = 0;
        int curr = 0;
        for (int num : nums) {
            int tmp = Math.max(curr, prev + num);
            prev = curr;
            curr = tmp;
        }
        return curr;
    }
}
