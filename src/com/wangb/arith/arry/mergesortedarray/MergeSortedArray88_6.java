package com.wangb.arith.arry.mergesortedarray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortedArray88_6 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
}
