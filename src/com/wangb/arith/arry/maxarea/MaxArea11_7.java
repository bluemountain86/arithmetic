package com.wangb.arith.arry.maxarea;

/**
 * @Author wangbin
 * @Date 2021/1/23
 */
public class MaxArea11_7 {
    public int maxArea(int[] height) {
        int maxArea = 0;
        if (height == null || height.length < 2) {
            return maxArea;
        }
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int area = (j - i) * Math.min(height[i], height[j]);
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }

    public int maxArea2(int[] height) {
        int maxArea = 0;
        if (height == null || height.length < 2) {
            return maxArea;
        }
        for (int i = 0, j = height.length - 1; i < j; ) {
            int minHeight = height[i] > height[j] ? height[j--] : height[i++];
            maxArea = Math.max(maxArea, (j - i + 1) * minHeight);
        }
        return maxArea;
    }
}
