package com.wangb.arith.arry.rotatearray;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-16 19:44:08
 */
public class RotateAarray198_1 {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        for (int i = 0; i < k; i++) {
            int tail = nums[len - 1];
            for (int j = len - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
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
