package com.wangb.arith.stack.largestrectangle;

import org.junit.Test;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-07 21:48:31
 */
public class LargestRectangle84_2 {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(right, n);

        Stack<Integer> mono_stack = new Stack<Integer>();
        for (int i = 0; i < n; ++i) {
            while (!mono_stack.isEmpty() && heights[mono_stack.peek()] >= heights[i]) {
                right[mono_stack.peek()] = i;
                mono_stack.pop();
            }
            left[i] = (mono_stack.isEmpty() ? -1 : mono_stack.peek());
            mono_stack.push(i);
        }

        int ans = 0;
        for (int i = 0; i < n; ++i) {
            ans = Math.max(ans, (right[i] - left[i] - 1) * heights[i]);
        }
        return ans;
    }

    @Test
    public void TestlargestRectangle() {
        int[] heights = new int[]{2, 3, 5, 6, 2, 3};
        System.out.println(largestRectangleArea(heights));
        heights = new int[]{20, 1, 2, 1, 2, 1};
        System.out.println(largestRectangleArea(heights));
        heights = new int[]{2, 1, 2, 15, 2, 1};
        System.out.println(largestRectangleArea(heights));
        heights = new int[]{10};
        System.out.println(largestRectangleArea(heights));
        heights = new int[]{};
        System.out.println(largestRectangleArea(heights));
        heights = new int[]{1, 1};
        System.out.println(largestRectangleArea(heights));
        heights = new int[]{0, 9};
        System.out.println(largestRectangleArea(heights));
        heights = new int[]{2, 1, 2};
        System.out.println(largestRectangleArea(heights));
    }
}
