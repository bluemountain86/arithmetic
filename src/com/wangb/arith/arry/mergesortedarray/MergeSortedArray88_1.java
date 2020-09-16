package com.wangb.arith.arry.mergesortedarray;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-16 19:44:08
 */
public class MergeSortedArray88_1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }

    @Test
    public void testMerge() {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;
        this.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}

