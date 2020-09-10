package com.wangb.arith.arry.movezeros;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-01 20:32:56
 */
public class MoveZeros283_4 {
    public void moveZeros1(int[] nums) {
        if (nums == null) {
            return;
        }
        int zeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            nums[i] = nums[zeroIndex];
            nums[zeroIndex] = tmp;
            if (nums[zeroIndex] != 0) {
                zeroIndex++;
            }
        }
    }

    @Test
    public void testMoveZeros1() {
        int[] nums = new int[]{0, 1, 0, 3, 0, 0, 12};
        long startTime = System.currentTimeMillis();
        moveZeros1(nums);
        System.out.println(System.currentTimeMillis() - startTime);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{0,0,1,0,0,2,3};
        moveZeros1(nums);
        System.out.println(Arrays.toString(nums));
    }


}
