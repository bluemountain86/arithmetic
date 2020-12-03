package com.wangb.arith.arry.trappingrainwater;

public class TrappingRainWater42_2 {
    public int trap(int[] height) {
        int maxTrap = 0;
        if (height == null || height.length < 3) {
            return maxTrap;
        }
        int lenght = height.length;
        for (int i = 1; i < lenght - 1; i++) {
            int maxLeft = 0;
            int maxRight = 0;
            for (int j = i; j >= 0; j--) {
                maxLeft = Math.max(maxLeft, height[j]);
            }
            for (int k = i; k < lenght; k++) {
                maxRight = Math.max(maxRight, height[k]);
            }
            maxTrap += Math.min(maxLeft, maxRight) - height[i];
        }
        return maxTrap;
    }
}
