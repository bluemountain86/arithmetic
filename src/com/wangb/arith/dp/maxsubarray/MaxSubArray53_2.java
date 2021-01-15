package com.wangb.arith.dp.maxsubarray;

public class MaxSubArray53_2 {
    public int maxSubArray(int[] nums) {
        int maxVal = nums[0];
        if (nums.length <= 1) {
            return maxVal;
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            maxVal = dp[i] > maxVal ? dp[i] : maxVal;
        }
        return maxVal;
    }
}
