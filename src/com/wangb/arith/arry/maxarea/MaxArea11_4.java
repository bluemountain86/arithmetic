package com.wangb.arith.arry.maxarea;

import org.junit.Test;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-02 23:16:12
 */
public class MaxArea11_4 {

    public int maxArea1(int[] height) {
        int maxArea = 0;
        if (height == null || height.length < 2) {
            return maxArea;
        }

        for (int left = 0, right = height.length - 1; left < right; ) {
            int minHeight = height[left] < height[right] ? height[left++] : height[right--];
            maxArea = Math.max(maxArea, minHeight * (right - left + 1));
        }
        return maxArea;
    }

    @Test
    public void testMaxArea() {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea1(height));
    }
}
