package com.wangb.arith.sort.reversepairs;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author wangbin
 * @Date 2021/1/1
 */
public class ReversePairs493_2 {
    public int reversePairs(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        return mergeSort(nums, 0, nums.length - 1);
    }

    private int mergeSort(int[] nums, int start, int end) {
        if (start >= end) {
            return 0;
        }
        int mid = start + (end - start) / 2;
        int count = mergeSort(nums, start, mid) + mergeSort(nums, mid + 1, end);

        int counter = start;
        int left = start;

        int[] merge = new int[end - start + 1];
        int index = 0;
        for (int right = mid + 1; right <= end; right++, index++) {
            while (counter <= mid && (long) nums[counter] <= (long) 2 * nums[right]) {
                counter++;
            }
            while (left <= mid && nums[left] < nums[right]) {
                merge[index++] = nums[left++];
            }

            merge[index] = nums[right];
            count += mid + 1 - counter;
        }

        while (left <= mid) {
            merge[index++] = nums[left++];
        }

        for (int i = 0; i < merge.length; i++) {
            nums[start + i] = merge[i];
        }

        return count;
    }

    @Test
    public void testMergeSort() {
        int[] array = {1, 3, 2, 3, 1};
        System.out.println(reversePairs(array));
        System.out.println(Arrays.toString(array));

        int[] array2 = {58, 48, 69, 87, 49, 59, 25, 35, 68, 48};
        System.out.println(reversePairs(array2));
        System.out.println(Arrays.toString(array2));

        int[] array3 = {2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647};
        System.out.println(reversePairs(array3));
        System.out.println(Arrays.toString(array3));
    }

}
