package com.wangb.arith.dp.maxproduct;

import org.junit.Test;

public class MaxProduct152_2 {
    public int maxProduct(int[] nums) {
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

    @Test
    public void testMaxProduct() {
        int[] nums1 = new int[]{3, -1, 4};
        System.out.println(maxProduct(nums1));
        int[] nums2 = new int[]{-3, 1, -4};
        System.out.println(maxProduct(nums2));
    }

}
