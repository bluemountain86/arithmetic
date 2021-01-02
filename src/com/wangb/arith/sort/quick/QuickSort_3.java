package com.wangb.arith.sort.quick;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author wangbin
 * @Date 2021/1/1
 */
public class QuickSort_3 {
    public void quickSort(int[] nums, int begin, int end) {
        if (begin >= end) {
            return;
        }
        int pivot = divid(nums, begin, end);
        quickSort(nums, begin, pivot - 1);
        quickSort(nums, pivot + 1, end);
    }

    private int divid(int[] nums, int begin, int end) {
        int counter = begin;
        int pivot = end;
        for (int i = begin; i < pivot; i++) {
            if (nums[i] < nums[pivot]) {
                int tmp = nums[counter];
                nums[counter] = nums[i];
                nums[i] = tmp;
                counter++;
            }
        }

        int tmp = nums[pivot];
        nums[pivot] = nums[counter];
        nums[counter] = tmp;

        return counter;
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