package com.wangb.arith.dp.maxsubarray;

/**
 * @Author wangbin
 * @Date 2021/1/22
 */
public class MaxSubArray53_4 {
    public int maxSubArray(int[] nums) {
        if (nums.length <= 1) {
            return nums[0];
        }
        int maxVal = nums[0];
        int[] dp = new int[nums.length + 1];
        dp[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            maxVal = Math.max(maxVal, dp[i]);
        }

        return maxVal;
    }

}
