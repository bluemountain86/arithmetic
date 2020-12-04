package com.wangb.arith.arry.maxarea;

public class MaxArea11_6 {
    public int maxArea1(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }
        int maxArea = 0;
        for (int i = 0, j = height.length - 1; i < j; ) {
            int minHeight = height[i] < height[j] ? height[i++] : height[j--];
            maxArea = Math.max(maxArea, minHeight * (j - i + 1));
        }

        return maxArea;
    }
}
