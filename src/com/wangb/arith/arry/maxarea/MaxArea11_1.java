package com.wangb.arith.arry.maxarea;

import org.junit.Test;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
import java.util.Arrays;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-01 21:00:13
 */
public class MaxArea11_1 {
    public int maxArea1(int[] height) {
        int maxArea = 0;
        if (height == null || height.length == 0) {
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

    @Test
    public void testMaxArea1() {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        long startTime = System.currentTimeMillis();
        System.out.println(maxArea1(height));
        System.out.println(System.currentTimeMillis() - startTime);
    }

    public int maxArea2(int[] height) {
        int maxArea = 0;
        if (height == null || height.length == 0) {
            return maxArea;
        }
        int tail = height.length - 1;
        for (int head = 0; tail > head; ) {
            int minHight = height[head] < height[tail] ? height[head++] : height[tail--];
            maxArea = Math.max(maxArea, (tail - head + 1) * minHight);
        }

        return maxArea;
    }

    @Test
    public void testMaxArea2() {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        long startTime = System.currentTimeMillis();
        System.out.println(maxArea2(height));
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
