package com.wangb.arith.dp.maxproduct;

import org.junit.Test;

/**
 * @Author wangbin
 * @Date 2021/1/15
 */
public class MaxProduct152_3 {
    public int maxProduct(int[] nums) {
        int maxVal = nums[0];

        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int tmax = max;
            int tmin = min;
            max = Math.max(max * nums[i], Math.max(min * nums[i], nums[i]));
            min = Math.min(min * nums[i], Math.min(max * nums[i], nums[i]));
            maxVal = Math.max(maxVal, max);
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

    public int maxProduct2(int[] nums) {
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
            maxVal = Math.max(maxVal, max);
        }
        return maxVal;
    }
}
