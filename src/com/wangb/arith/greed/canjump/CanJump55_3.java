package com.wangb.arith.greed.canjump;

import org.junit.Test;

/**
 * @Author wangbin
 * @Date 2020/12/29
 */
public class CanJump55_3 {
    public boolean canJump(int[] nums) {
        int jumpIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (jumpIndex < i) {
                return false;
            }
            jumpIndex = Math.max(jumpIndex, i + nums[i]);
        }
        return true;
    }

    @Test
    public void testCanJump() {
//        int[] nums1 = {2, 3, 1, 1, 4};
//        System.out.println(canJump(nums1));
//
//        int[] nums2 = {3,2,1,0,4};
//        System.out.println(canJump(nums2));

        int[] nums3 = {3,4,1,0,4};
        System.out.println(canJump(nums3));
    }

}
