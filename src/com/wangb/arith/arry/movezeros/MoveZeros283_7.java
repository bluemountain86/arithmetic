package com.wangb.arith.arry.movezeros;

/**
 * @Author wangbin
 * @Date 2021/1/23
 */
public class MoveZeros283_7 {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        int index = 0;
        //[0,1,0,3,12]
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                if (index < i) {
                    nums[i] = 0;
                }
                index++;
            }
        }
    }
}
