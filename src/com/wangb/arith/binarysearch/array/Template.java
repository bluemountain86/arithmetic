package com.wangb.arith.binarysearch.array;

import org.junit.Test;

/**
 * @Author wangbin
 * @Date 2020/12/28
 */
public class Template {
    public int find(int[] nums, int target) {
        int targetIndex = -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                targetIndex = mid;
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return targetIndex;
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
