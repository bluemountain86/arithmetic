package com.wangb.arith.greed.canjump;

/**
 * @Author wangbin
 * @Date 2021/1/5
 */
public class CanJump55_4 {
    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > max) {
                return false;
            }
            max = Math.max(max, i + nums[i]);
        }
        return true;
    }
}
