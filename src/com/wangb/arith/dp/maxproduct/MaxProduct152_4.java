package com.wangb.arith.dp.maxproduct;

/**
 * @Author wangbin
 * @Date 2021/1/22
 */
public class MaxProduct152_4 {
    public int maxProduct(int[] nums) {
        if (nums.length <= 1) {
            return nums[0];
        }
        int maxVal = Integer.MIN_VALUE;
        int max = 1;
        int min = 1;
        for (int num : nums) {
            int tmax = max;
            int tmin = min;
            max = Math.max(tmax * num, Math.max(tmin * num, num));
            min = Math.min(tmin * num, Math.min(tmax * num, num));
            maxVal = Math.max(max, maxVal);
        }
        return maxVal;
    }

    public int maxProduct2(int[] nums) {
        if (nums.length <= 1) {
            return nums[0];
        }
        int maxVal = Integer.MIN_VALUE;
        int max = 1;
        int min = 1;
        for (int num : nums) {
            if (num < 0) {
                int tmp = max;
                max = min;
                min = tmp;
            }
            max = Math.max(max * num, num);
            min = Math.min(min * num, num);
            maxVal = Math.max(max, maxVal);
        }
        return maxVal;
    }
}
