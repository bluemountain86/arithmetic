package com.wangb.arith.greed.jump;

/**
 * @Author wangbin
 * @Date 2020/12/28
 */
public class Jump45_1 {

    /**
     * n平方的复杂度，执行超时
     *
     * @param nums
     * @return
     */
    public int jump1(int[] nums) {
        int steps = 0;
        int position = nums.length - 1;
        while (position > 0) {
            for (int i = 0; i < position; i++) {
                if (i + nums[i] >= position) {
                    position = i;
                    steps++;
                    break;
                }
            }
        }
        return steps;
    }

    public int jump2(int[] nums) {
        int steps = 0;
        int position = 0;
        int maxIndex = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxIndex = Math.max(maxIndex, i + nums[i]);
            if (i == position) {
                steps++;
                position = maxIndex;
            }
        }
        return steps;
    }

}
