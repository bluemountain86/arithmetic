package com.wangb.arith.arry.majorityelement;

import java.util.Arrays;

public class MajorityElement169_2 {
    public int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public int majorityElement2(int[] nums) {
        int candiNum = nums[0];
        int counter = 1;
        for (int i = 1; i < nums.length; i++) {
            if (candiNum == nums[i]) {
                ++counter;
            } else if (--counter == 0) {
                candiNum = nums[i];
                counter = 1;
            }
        }
        return candiNum;
    }
}
