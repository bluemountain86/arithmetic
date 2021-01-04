package com.wangb.arith.binarysearch.findmin;

/**
 * @Author wangbin
 * @Date 2020/12/30
 */
public class FindMin153_2 {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        if (nums[0] <= nums[right]) {
            return nums[0];
        }
        int midIndex = 0;
        //[4,5,6,7,0,1,2]
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
