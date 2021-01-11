package com.wangb.arith.sort.reversepairs;

/**
 * @Author wangbin
 * @Date 2021/1/11
 */
public class ReversePairs493_4 {
    public int reversePairs(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        return merge(nums, 0, nums.length - 1);
    }

    private int merge(int[] nums, int start, int end) {
        if (start >= end) {
            return 0;
        }
        int mid = start + (end - start) / 2;
        int count = merge(nums, start, mid) + merge(nums, mid + 1, end);

        int left = start;
        int counter = start;

        int[] merge = new int[end - start + 1];
        int mergeIndex = 0;
        for (int right = mid + 1; right <= end; right++, mergeIndex++) {
            while (counter <= mid && (long) nums[counter] <= (long) 2 * nums[right]) {
                counter++;
            }
            while (left <= mid && nums[left] < nums[right]) {
                merge[mergeIndex++] = nums[left++];
            }
            merge[mergeIndex] = nums[right];
            count += (mid - counter + 1);

        }
        while (left <= mid) {
            merge[mergeIndex++] = nums[left++];
        }

        for (int i = 0; i < merge.length; i++) {
            nums[start + i] = merge[i];
        }

        return count;
    }
}
