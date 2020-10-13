package com.wangb.arith.stack.slidingwindow;

import java.util.LinkedList;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-10-01 21:05:47
 */
public class MaxSlidingWindow239_4 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length < 2) {
            return nums;
        }
        int[] maxVals = new int[nums.length - k + 1];
        LinkedList<Integer> maxIndxs = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            while (!maxIndxs.isEmpty() && nums[maxIndxs.peekLast()] <= nums[i]) {
                maxIndxs.pollLast();
            }
            maxIndxs.add(i);
            if (maxIndxs.peek() < i - k + 1) {
                maxIndxs.poll();
            }
            if (i + 1 >= k) {
                maxVals[i - k + 1] = nums[maxIndxs.peek()];
            }
        }
        return maxVals;
    }
}
