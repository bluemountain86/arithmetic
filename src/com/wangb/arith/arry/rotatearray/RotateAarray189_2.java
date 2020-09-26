package com.wangb.arith.arry.rotatearray;

import org.junit.Test;

import java.util.Arrays;

public class RotateAarray189_2 {
    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int tail = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = tail;
        }
    }

    @Test
    public void testRotate() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}
