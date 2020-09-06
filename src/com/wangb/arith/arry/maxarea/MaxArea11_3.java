package com.wangb.arith.arry.maxarea;

import org.junit.Test;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-02 23:16:12
 */
public class MaxArea11_3 {

    public int maxArea1(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int maxArea = 0;
        for (int head = 0, tail = height.length - 1; head < tail; ) {
            int minHeight = height[head] < height[tail] ? height[head++] : height[tail--];
            maxArea = Math.max(maxArea, minHeight * (tail - head + 1));
        }
        return maxArea;
    }

    @Test
    public void testMaxArea() {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea1(height));
    }
}
