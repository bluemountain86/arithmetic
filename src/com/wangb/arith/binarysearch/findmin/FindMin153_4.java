package com.wangb.arith.binarysearch.findmin;

import org.junit.Test;

/**
 * @Author wangbin
 * @Date 2021/1/4
 */
public class FindMin153_4 {
    public int findMin(int[] nums) {

        if (nums.length < 2) {
            return 1;
        }

        int left = 0;
        int right = nums.length - 1;

        //[4,5,6,7,0,1,2]
        while (left < right) {
            int mid = left + (right - left) / 2;
//            if (nums[mid] < nums[right]) {
//                right = mid;
//            } else {
//                left = mid + 1;
//            }
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }

    @Test
    public void testFindMin() {
        int[] nums = new int[]{2, 3, 4, 5, 1};
        System.out.println(findMin(nums));
    }

}
