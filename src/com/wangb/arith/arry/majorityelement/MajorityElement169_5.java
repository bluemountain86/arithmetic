package com.wangb.arith.arry.majorityelement;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MajorityElement169_5 {
    public int majorityElemen1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
