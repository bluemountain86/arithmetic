package com.wangb.arith.dp.maxproduct;

import org.junit.Test;

public class MaxProduct152_1 {
    public int maxProduct(int[] nums) {
        int maxVal = nums[0];

        int max = nums[0];
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int tmax = max;
            int tmin = min;
            max = Math.max(nums[i] * tmax, Math.max(nums[i] * tmin, nums[i]));
            min = Math.min(nums[i] * tmin, Math.min(nums[i] * tmax, nums[i]));
            maxVal = Math.max(max, maxVal);
        }
        return maxVal;
    }

    @Test
    public void testMaxProduct() {
        int[] nums1 = new int[]{3, -1, 4};
        System.out.println(maxProduct(nums1));
        int[] nums2 = new int[]{-3, 1, -4};
        System.out.println(maxProduct(nums2));
    }

}
