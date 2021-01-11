package com.wangb.arith.sort.merge;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author wangbin
 * @Date 2021/1/11
 */
public class MergeSort_4 {
    public void mergeSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid + 1, end);
        merge(nums, start, mid, end);
    }

    private void merge(int[] nums, int start, int mid, int end) {
        int left = start;
        int right = mid + 1;

        int[] merge = new int[end - start + 1];
        int counter = 0;

        while (left <= mid && right <= end) {
            merge[counter++] = nums[left] < nums[right] ? nums[left++] : nums[right++];
        }

        while (left <= mid) {
            merge[counter++] = nums[left++];
        }

        while (right <= end) {
            merge[counter++] = nums[right++];
        }

        for (int i = 0; i < merge.length; i++) {
            nums[start + i] = merge[i];
        }
    }


    @Test
    public void testMergeSort() {
        int[] nums = {9, 98, 1, 3, 6, 54, 89, 2, 501, 5, 98, 12};
        mergeSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
        int[] nums2 = {99, 98};
        mergeSort(nums2, 0, nums2.length - 1);
        System.out.println(Arrays.toString(nums2));
    }
}
