package com.wangb.arith.stack.slidingwindow;

import java.util.LinkedList;

/**
 * @Author wangbin
 * @Date 2020/12/11
 */
public class MaxSlidingWindow239_6 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null) {
            return new int[0];
        }
        int[] maxVals = new int[nums.length - k + 1];
        LinkedList<Integer> index = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            while (!index.isEmpty() && nums[index.peekLast()] <= nums[i]) {
                index.pollLast();
            }

            index.add(i);

            if (index.peek() < i - k + 1) {
                index.poll();
            }

            if (i + 1 >= k) {
                maxVals[i - k + 1] = nums[index.peek()];
            }
        }
        return maxVals;
    }
}