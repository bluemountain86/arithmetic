package com.wangb.arith.arry.removeduplicates;

public class RemoveDuplicates26_5 {
    public int removeDuplicates1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int length = 0;
        nums[length] = nums[0];
        length++;
        for (int i = 1; i < nums.length; i++) {
            if (nums[length - 1] < nums[i]) {
                nums[length++] = nums[i];
            }
        }
        return length;
    }
}
