package com.wangb.arith.stack.largestrectangle;

import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-16 19:44:08
 */
public class LargestRectangle84_4 {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        if (heights == null || heights.length == 0) {
            return maxArea;
        }
        int len = heights.length;
        int[] left = new int[len];
        int[] right = new int[len];
        Arrays.fill(right, len);
        Stack<Integer> minStack = new Stack<>();
        for (int i = 0; i < len; i++) {
            while (!minStack.isEmpty() && heights[minStack.peek()] > heights[i]) {
                right[minStack.pop()] = i;
            }

            left[i] = minStack.isEmpty() ? -1 : minStack.peek();
            minStack.push(i);
        }

        for (int i = 0; i < len; i++) {
            maxArea = Math.max(maxArea, (right[i] - left[i] - 1) * heights[i]);
        }

        return maxArea;
    }

    @Test
    public void TestlargestRectangle() {
        int[] heights = new int[]{2, 3, 5, 6, 2, 3};
        System.out.println(largestRectangleArea(heights));
        heights = new int[]{2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangleArea(heights));
    }
}
