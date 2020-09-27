package com.wangb.arith.arry.rotatearray;

public class RotateAarray189_3 {
    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int tail = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = tail;
        }
    }
}
