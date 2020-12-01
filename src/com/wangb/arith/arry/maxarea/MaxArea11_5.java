package com.wangb.arith.arry.maxarea;

public class MaxArea11_5 {
    public int maxArea1(int[] height) {
        int maxArea = 0;
        for (int left = 0, right = height.length - 1; left < right; ) {
            int minHeight = height[left] < height[right] ? height[left++] : height[right--];
            maxArea = Integer.max(maxArea, minHeight * (right - left + 1));
        }
        return maxArea;
    }
}
