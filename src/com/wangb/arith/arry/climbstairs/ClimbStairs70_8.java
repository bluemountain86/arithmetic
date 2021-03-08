package com.wangb.arith.arry.climbstairs;

/**
 * @Author wangbin
 * @Date 2021/3/3
 */
public class ClimbStairs70_8 {
    public int climbStairs(int step) {
        //1=1
        //2=1,1;2
        //3=1,1,1;2,1;1,2;
        if (step < 3) {
            return step;
        }
        int s1 = 1;
        int s2 = 2;
        int s3 = 0;
        for (int i = 3; i <= step; i++) {
            s3 = s1 + s2;
            s1 = s2;
            s2 = s3;
        }
        return s3;
    }
}
