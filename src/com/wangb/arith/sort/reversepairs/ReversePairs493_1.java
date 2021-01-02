package com.wangb.arith.sort.reversepairs;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author wangbin
 * @Date 2020/12/31
 */
public class ReversePairs493_1 {

    int count = 0;

    public int reversePairs(int[] nums) {
        countReversePairs(nums, 0, nums.length - 1);
        return count;
    }

    private void countReversePairs(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (end + start) / 2;
        countReversePairs(nums, start, mid);
        countReversePairs(nums, mid + 1, end);
        merge(nums, start, mid, end);
    }

    private void merge(int[] nums, int start, int mid, int end) {
        int[] meregeArray = new int[end - start + 1];
        int low = 0;
        int startIndex = start;
        int center = mid + 1;

        int left = start;
        int right = mid + 1;

        // 计算nums[left] > (long) nums[right] * 2的个数
        while (left <= mid) {
            while (right <= end && (long) nums[left] > (long) nums[right] * 2) {
                right++;
            }
            count += right - mid - 1;
            left++;
        }

        while (start <= mid && center <= end) {
            meregeArray[low++] = nums[start] > nums[center] ? nums[center++] : nums[start++];
        }

        while (start <= mid) {
            meregeArray[low++] = nums[start++];
        }
        while (center <= end) {
            meregeArray[low++] = nums[center++];
        }

        for (int i = 0; i < meregeArray.length; i++) {
            nums[startIndex + i] = meregeArray[i];
        }
    }


    @Test
    public void testMergeSort() {
        int[] array = {1, 3, 2, 3, 1};
        System.out.println(reversePairs(array));
        System.out.println(Arrays.toString(array));

        int[] array2 = {58, 48, 69, 87, 49, 59, 25, 35, 68, 48};
        System.out.println(reversePairs(array2));
        System.out.println(Arrays.toString(array2));
    }

}
