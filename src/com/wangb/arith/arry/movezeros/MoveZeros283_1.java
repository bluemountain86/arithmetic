package com.wangb.arith.arry.movezeros;

import java.util.Arrays;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-08-31 23:25:41
 */
public class MoveZeros283_1 {
    /**
     * 输入: [0,1,0,3,12]
     * 输出: [1,3,12,0,0]
     * @param nums
     */
    public static void moveZeros(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[j] = nums[i];
                if(j != i) {
                    nums[i] = 0;
                }
                j++;
            }
            System.out.println(Arrays.toString(nums));
        }
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{0,1,0,3,12};
//        int[] nums = new int[]{0,0,1,0,3,12};
        int[] nums = new int[]{0,0,1,0,3,12,0};

        moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }
}
