package com.wangb.arith.stack.slidingwindow;

import java.util.LinkedList;

/**
 * @Author wangbin
 * @Date 2020/12/14
 */
public class MaxSlidingWindow239_7 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null) {
            return nums;
        }
        int length = nums.length;
        int[] maxVals = new int[length - k + 1];
        LinkedList<Integer> indexs = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            while (!indexs.isEmpty() && maxVals[indexs.peekLast()] <= nums[i]) {
                indexs.pollLast();
            }
            indexs.addLast(i);

            if (indexs.peek() <= i - k) {
                indexs.poll();
            }

            if (i >= k - 1) {
                maxVals[i - k + 1] = nums[indexs.peek()];
            }
        }
        return maxVals;
    }
}
