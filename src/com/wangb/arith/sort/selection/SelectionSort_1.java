package com.wangb.arith.sort.selection;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author wangbin
 * @Date 2020/12/30
 */
public class SelectionSort_1 {
    public int[] selectionSort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return nums;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = tmp;
        }

        return nums;
    }

    @Test
    public void testSelectionSort() {
        int[] nums = {9, 98, 1, 3, 6, 54, 89, 2, 501, 5, 98, 12};
        System.out.println(Arrays.toString(selectionSort(nums)));
    }
}
