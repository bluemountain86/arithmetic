package com.wangb.arith.arry.rotatearray;

/**
 * @Author wangbin
 * @Date 2020/12/4
 */
public class RotateAarray189_6 {
    public void rotate(int[] nums, int k) {
        int tailValue = 0;
        for (int i = 0; i < k; i++) {
            tailValue = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = tailValue;
        }
    }
}
