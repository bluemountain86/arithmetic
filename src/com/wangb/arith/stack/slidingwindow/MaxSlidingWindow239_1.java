package com.wangb.arith.stack.slidingwindow;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-16 19:44:08
 */
public class MaxSlidingWindow239_1 {
    public int[] maxSlidingWindow1(int[] nums, int k) {
        int len = nums.length;
        int[] maxVals = new int[len - k + 1];
        for (int i = 0; i < len - k + 1; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                max = Math.max(nums[j], max);
            }
            maxVals[i] = max;
        }
        return maxVals;
    }

    @Test
    public void testMaxSlidingWindow1() {
        int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int[] maxVals = maxSlidingWindow1(nums, 3);
        System.out.println(Arrays.toString(maxVals));
    }

    public int[] maxSlidingWindow2(int[] nums, int k) {
        int len = nums.length;
        int[] maxVals = new int[len - k + 1];
        LinkedList<Integer> maxIdxs = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            while (!maxIdxs.isEmpty() && nums[maxIdxs.peekLast()] <= nums[i]) {
                maxIdxs.pollLast();
            }
            maxIdxs.addLast(i);
            if (maxIdxs.peek() < i - k + 1) {
                maxIdxs.poll();
            }
            if (i + 1 >= k) {
                maxVals[i - k + 1] = nums[maxIdxs.peek()];
            }
        }
        return maxVals;
    }

    @Test
    public void testMaxSlidingWindow2() {
        int[] nums = new int[]{1, 3, 8, -3, 5, 3, 6, 7};
        int[] maxVals = maxSlidingWindow2(nums, 3);
        System.out.println(Arrays.toString(maxVals));
    }
}
