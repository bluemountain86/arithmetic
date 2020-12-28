package com.wangb.arith.greed.canjump;

/**
 * @Author wangbin
 * @Date 2020/12/28
 */
public class CanJump55_1 {
    public boolean canJump(int[] nums) {
        int length = nums.length;
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (index < i) {
                return false;
            }
            index = Math.max(index, nums[i] + i);
        }
        return true;
    }
}
