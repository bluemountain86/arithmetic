package com.wangb.arith.dp.maxsubarray;

public class MaxSubArray53_3 {
    public int maxSubArray(int[] nums) {
        int maxVal = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum > 0) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            maxVal = maxVal > sum ? maxVal : sum;
        }
        return maxVal;
    }
}
