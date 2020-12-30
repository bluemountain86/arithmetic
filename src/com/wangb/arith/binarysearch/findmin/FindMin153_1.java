package com.wangb.arith.binarysearch.findmin;

/**
 * @Author wangbin
 * @Date 2020/12/30
 */
public class FindMin153_1 {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int midIndex = 0;
        if (nums[right] >= nums[0]) {
            return nums[0];
        }
        while (left < right) {
            midIndex = left + (right - left) / 2;
            if (nums[midIndex] < nums[right]) {
                right = midIndex;
            } else {
                left = midIndex + 1;
            }
        }
        return nums[left];
    }
}
