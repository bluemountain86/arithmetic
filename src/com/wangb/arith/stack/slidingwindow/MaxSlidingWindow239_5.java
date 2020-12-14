package com.wangb.arith.stack.slidingwindow;

import java.util.LinkedList;

/**
 * @Author wangbin
 * @Date 2020/12/11
 */
public class MaxSlidingWindow239_5 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length < 2) {
            return nums;
        }

        int[] maxVals = new int[nums.length - k + 1];
        LinkedList<Integer> maxIndexs = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            while (!maxIndexs.isEmpty() && nums[maxIndexs.peekLast()] <= nums[i]) {
                maxIndexs.pollLast();
            }

            maxIndexs.addLast(i);

            if (maxIndexs.peek() < i - k + 1) {
                maxIndexs.poll();
            }

            if (i >= k - 1) {
                maxVals[i - k + 1] = nums[maxIndexs.peek()];
            }
        }
        return maxVals;
    }

}
