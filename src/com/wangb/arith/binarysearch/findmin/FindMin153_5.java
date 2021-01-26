package com.wangb.arith.binarysearch.findmin;

import org.junit.Test;

/**
 * @Author wangbin
 * @Date 2021/1/26
 */
public class FindMin153_5 {
    public int findMin(int[] nums) {
//        [4,5,6,7,0,1,2]
        int left = 0;
        int right = nums.length - 1;

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

    @Test
    public void testFindMin() {
        int[] nums1 = new int[]{2, 3, 4, 5, 1};
        System.out.println(findMin(nums1));

        int[] nums2 = new int[]{4, 5, 6, 7, 0, 1, 2};
        System.out.println(findMin(nums2));

        int[] nums3 = new int[]{7, 0, 1};
        System.out.println(findMin(nums2));
    }

}
