package com.wangb.arith.arry.movezeros;

public class MoveZeros283_6 {
    public void moveZeroes(int[] nums) {
        int moveIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[moveIndex] = nums[i];
                if (moveIndex < i) {
                    nums[i] = 0;
                }
                moveIndex++;
            }
        }
    }
}
