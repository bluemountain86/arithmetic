package com.wangb.arith.stack.slidingwindow;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MaxSlidingWindow239_2 {
    public int[] maxSlidingWindow1(int[] nums, int k) {
        int[] maxVals = new int[nums.length - k + 1];
        if (nums == null) {
            return maxVals;
        }
        for (int i = 0; i < nums.length - k + 1; i++) {
            int maxVal = Integer.MIN_VALUE;
            for (int j = i; j < (i + k); j++) {
                maxVal = Math.max(maxVal, nums[j]);
            }
            maxVals[i] = maxVal;
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
        int[] maxVals = new int[nums.length - k + 1];
        if (nums == null || nums.length < 2) {
            return nums;
        }
        LinkedList<Integer> maxIdxs = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            while (!maxIdxs.isEmpty() && nums[maxIdxs.peekLast()] <= nums[i]) {
                maxIdxs.pollLast();
            }
            maxIdxs.add(i);
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
