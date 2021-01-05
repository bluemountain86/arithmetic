package com.wangb.arith.greed.jump;

/**
 * @Author wangbin
 * @Date 2021/1/5
 */
public class Jump45_4 {
    public int jump(int[] nums) {
        int steps = 0;
        int position = 0;
        int maxIndex = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxIndex = Math.max(maxIndex, i + nums[i]);
            if (i == position) {
                ++steps;
                position = maxIndex;
            }
        }
        return steps;
    }

}
