package com.wangb.arith.greed.canjump;

/**
 * @Author wangbin
 * @Date 2020/12/28
 */
public class CanJump55_2 {
    public boolean canJump(int[] nums) {
        int jumpIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (jumpIndex < i) {
                return false;
            }
            jumpIndex = Math.max(jumpIndex, nums[i] + i);
        }
        return true;
    }
}
