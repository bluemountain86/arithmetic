package com.wangb.arith.arry.trappingrainwater;

import org.junit.Test;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-10-01 21:29:00
 */
public class TrappingRainWater42_1 {
    public int trap(int[] height) {
        int trap = 0;
        int size = height.length;
        for (int i = 1; i < size - 1; i++) {
            int left = 0;
            int right = 0;
            for (int j = i; j >= 0; j--) {
                left = Math.max(left, height[j]);
            }
            for (int j = i; j < size; j++) {
                right = Math.max(right, height[j]);
            }
            trap += Math.min(left, right) - height[i];
        }
        return trap;
    }

    @Test
    public void testTrap() {
        int[] height = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height));
    }
}
