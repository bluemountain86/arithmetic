package com.wangb.arith.binarysearch.findmin;

/**
 * @Author wangbin
 * @Date 2021/3/3
 */
public class FindMin153_6 {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        // [4,5,6,7,0,1,2]
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
}
