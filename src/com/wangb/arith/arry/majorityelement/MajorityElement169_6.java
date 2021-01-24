package com.wangb.arith.arry.majorityelement;

import java.util.Arrays;

/**
 * @Author wangbin
 * @Date 2021/1/23
 */
public class MajorityElement169_6 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
