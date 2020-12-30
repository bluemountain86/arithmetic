package com.wangb.arith.binarysearch.search;

/**
 * @Author wangbin
 * @Date 2020/12/30
 */
public class Search33_3 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int midIndex = 0;
        while (left < right) {
            midIndex = left + (right - left) / 2;
            if (nums[0] <= nums[midIndex] && (target < nums[0] || target > nums[midIndex])) {
                left = midIndex + 1;
            } else if (target > nums[midIndex] && nums[0] > target) {
                left = midIndex + 1;
            } else {
                right = midIndex;
            }
        }
        return left == right && nums[left] == target ? left : -1;
    }
}
