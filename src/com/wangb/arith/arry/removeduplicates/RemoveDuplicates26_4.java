package com.wangb.arith.arry.removeduplicates;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-28 22:46:04
 */
public class RemoveDuplicates26_4 {
    public int removeDuplicates1(int[] nums) {
        int length = 0;
        if (nums == null) {
            return length;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            nums[length++] = nums[i];
        }
        return length;
    }

    public int removeDuplicates2(int[] nums) {
        int length = 0;
        if (nums == null || nums.length == 0) {
            return length;
        }
        nums[length] = nums[0];
        length++;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                nums[length++] = nums[i];
            }
        }
        return length;
    }
}
