package com.wangb.arith.sort.quick;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author wangbin
 * @Date 2021/1/11
 */
public class QuickSort_4 {
    public void quickSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int pivot = divide(nums, start, end);
        quickSort(nums, start, pivot - 1);
        quickSort(nums, pivot + 1, end);
    }

    private int divide(int[] nums, int start, int end) {
        int index = start;
        for (int i = start; i < end; i++) {
            if (nums[i] < nums[end]) {
                int tmp = nums[i];
                nums[i] = nums[index];
                nums[index] = tmp;
                index++;
            }
        }
        int tmp = nums[end];
        nums[end] = nums[index];
        nums[index] = tmp;
        return index;
    }

    @Test
    public void testQuickSort() {
        int[] nums = {9, 98, 1, 3, 6, 54, 89, 2, 501, 5, 98, 12};
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
        int[] nums2 = {99, 98};
        quickSort(nums2, 0, nums2.length - 1);
        System.out.println(Arrays.toString(nums2));
    }
}
