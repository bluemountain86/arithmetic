package com.wangb.arith.binarysearch.array;

import org.junit.Test;

/**
 * @Author wangbin
 * @Date 2021/1/26
 */
public class Templat2 {
    public int find(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    @Test
    public void testFind() {
        int[] nums1 = {3};
        System.out.println(find(nums1, 3));

        int[] nums2 = {3, 4};
        System.out.println(find(nums2, 3));

        int[] nums3 = {3, 4};
        System.out.println(find(nums3, 4));

        int[] nums4 = {3, 4, 5};
        System.out.println(find(nums4, 4));


        int[] nums5 = {3, 4, 5, 6, 7, 8};
        System.out.println(find(nums5, 6));

        int[] nums6 = {3, 4, 5, 6, 7, 8};
        System.out.println(find(nums6, 8));
    }
}
