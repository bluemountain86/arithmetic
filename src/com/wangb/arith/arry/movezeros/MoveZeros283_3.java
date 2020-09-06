package com.wangb.arith.arry.movezeros;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-01 20:32:56
 */
public class MoveZeros283_3 {
    public void moveZeros1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int temp = 0;
        int moveIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp = nums[moveIndex];
                nums[moveIndex] = nums[i];
                nums[i] = temp;
                moveIndex++;
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
    }

    public void moveZeros2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int moveIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[moveIndex] = nums[i];
                if(moveIndex < i) {
                    nums[i] = 0;
                }
                moveIndex ++;
            }
        }
    }

    @Test
    public void testMoveZeros2() {
        int[] nums = new int[]{0, 1, 0, 3, 0, 0, 12};
        long startTime = System.currentTimeMillis();
        moveZeros2(nums);
        System.out.println(System.currentTimeMillis() - startTime);
        System.out.println(Arrays.toString(nums));
    }
}
