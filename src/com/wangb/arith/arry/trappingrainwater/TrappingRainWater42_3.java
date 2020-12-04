package com.wangb.arith.arry.trappingrainwater;

/**
 * @Author wangbin
 * @Date 2020/12/4
 */
public class TrappingRainWater42_3 {
    public int trap(int[] height) {
        int volume = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int left = 0;
            for (int j = i; j >= 0; j--) {
                left = Math.max(left, height[j]);
            }
            int right = 0;
            for (int j = i; j < height.length; j++) {
                right = Math.max(right, height[j]);
            }

            volume += Math.min(left, right) - height[i];

        }
        return volume;
    }
}
