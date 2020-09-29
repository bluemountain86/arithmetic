package com.wangb.arith.stack.slidingwindow;

import com.sun.org.apache.xml.internal.dtm.ref.DTMAxisIterNodeList;

import java.util.LinkedList;

public class MaxSlidingWindow239_3 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length < 2) {
            return nums;
        }
        int[] maxVals = new int[nums.length - k + 1];
        LinkedList<Integer> maxIdxs = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            while (!maxIdxs.isEmpty() && nums[maxIdxs.peekLast()] <= nums[i]) {
                maxIdxs.pollLast();
            }

            maxIdxs.add(i);
            if (maxIdxs.peek() < i - k + 1) {
                maxIdxs.poll();
            }
            if (i >= k - 1) {
                maxVals[i - k + 1] = nums[maxIdxs.peek()];
            }
        }
        return maxVals;
    }

}
