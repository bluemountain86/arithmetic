package com.wangb.arith.arry.maxarea;

import org.junit.Test;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-01 22:00:05
 */
public class MaxArea11_2 {
    public int maxArea1(int[] height) {
        int maxArea = 0;
        if (height == null || height.length == 0) {
            return maxArea;
        }

        int tail = height.length - 1;
        for (int head = 0; head < tail; ) {
            int minHeight = height[head] < height[tail] ? height[head++] : height[tail--];
            maxArea = Math.max(maxArea, minHeight * (tail - head + 1));
        }

        return maxArea;
    }

    @Test
    public void testMaxArea1() {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        long startTime = System.currentTimeMillis();
        System.out.println(maxArea1(height));
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
