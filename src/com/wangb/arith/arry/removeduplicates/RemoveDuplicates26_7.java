package com.wangb.arith.arry.removeduplicates;

/**
 * @Author wangbin
 * @Date 2021/1/23
 */
public class RemoveDuplicates26_7 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int length = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[length] != nums[i]) {
                length++;
                nums[length] = nums[i];
            }
        }
        return length + 1;
    }
}
