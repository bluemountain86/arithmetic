package com.wangb.arith.dp.rob1;

/**
 * @Author wangbin
 * @Date 2021/2/5
 */
public class Rob198_4 {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int size = nums.length;
        int[] dp = new int[size + 1];

        // [1,2,3,1]
        // dp[i] = max(dp[i-1] ,nums[i-1] + dp[i-2]);
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i - 1] + dp[i - 2]);
        }
        return dp[size];
    }

    public int rob2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

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
