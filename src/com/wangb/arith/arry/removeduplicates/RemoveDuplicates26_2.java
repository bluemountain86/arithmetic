package com.wangb.arith.arry.removeduplicates;

public class RemoveDuplicates26_2 {
    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            nums[length] = nums[i];
            length++;
        }
        return length;
    }
}
