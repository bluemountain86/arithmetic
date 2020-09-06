package com.wangb.arith.stack.largestrectangle;

import org.junit.Test;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-06 17:23:06
 */
public class LargestRectangle84_1 {

    public int largestRectangle1(int[] heights) {
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            for (int j = i; j < heights.length; j++) {
                int minHeight = Integer.MAX_VALUE;
                for (int k = i; k <= j; k++) {
                    minHeight = Math.min(minHeight, heights[k]);
                }
                maxArea = Math.max(maxArea, minHeight * (j - i + 1));
            }
        }
        return maxArea;
    }

    public int largestRectangle2(int[] heights) {
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int minHeight = Integer.MAX_VALUE;
            for (int j = i; j < heights.length; j++) {
                minHeight = Math.min(minHeight, heights[j]);
                maxArea = Math.max(maxArea, minHeight * (j - i + 1));
            }
        }
        return maxArea;
    }

    @Test
    public void TestLargestRectangle1() {
        int[] heights = new int[]{2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangle1(heights));
        heights = new int[]{20, 1, 2, 1, 2, 1};
        System.out.println(largestRectangle1(heights));
        heights = new int[]{2, 1, 2, 15, 2, 1};
        System.out.println(largestRectangle1(heights));
        heights = new int[]{10};
        System.out.println(largestRectangle1(heights));
        heights = new int[]{};
        System.out.println(largestRectangle1(heights));
        heights = new int[]{1, 1};
        System.out.println(largestRectangle1(heights));
        heights = new int[]{0, 9};
        System.out.println(largestRectangle1(heights));
        heights = new int[]{2, 1, 2};
        System.out.println(largestRectangle1(heights));
    }

}
