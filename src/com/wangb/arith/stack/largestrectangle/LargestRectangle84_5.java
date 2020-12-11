package com.wangb.arith.stack.largestrectangle;

import java.util.Arrays;
import java.util.Stack;

/**
 * @Author wangbin
 * @Date 2020/12/11
 */
public class LargestRectangle84_5 {
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }
        int length = heights.length;
        int[] leftBound = new int[length];
        int[] rightBound = new int[length];
        Arrays.fill(rightBound, length);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
                rightBound[stack.pop()] = i;
            }
            leftBound[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        int maxRec = 0;

        for (int i = 0; i < length; i++) {
            maxRec = Math.max(maxRec, (rightBound[i] - leftBound[i] - 1) * heights[i]);
        }
        return maxRec;
    }
}
