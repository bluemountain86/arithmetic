package com.wangb.arith.binarysearch.findmin;

/**
 * @Author wangbin
 * @Date 2020/12/31
 */
public class FindMin153_3 {
    public int fundMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        //[4,5,6,7,0,1,2]
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
