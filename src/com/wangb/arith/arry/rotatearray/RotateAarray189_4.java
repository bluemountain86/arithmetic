package com.wangb.arith.arry.rotatearray;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-28 22:56:18
 */
public class RotateAarray189_4 {
    public void rotate(int[] nums, int k) {
        int tail = 0;
        for (int i = 0; i < k; i++) {
            tail = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = tail;
        }
    }
}
