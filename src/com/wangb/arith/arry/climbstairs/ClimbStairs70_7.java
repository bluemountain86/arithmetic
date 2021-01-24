package com.wangb.arith.arry.climbstairs;

/**
 * @Author wangbin
 * @Date 2021/1/23
 */
public class ClimbStairs70_7 {
    public int climbStairs(int n) {
        if (n <= 3) {
            return n;
        }
        int s1 = 1;
        int s2 = 2;
        int s3 = s1 + s2;
        for (int i = 4; i <= n; i++) {
            s1 = s2;
            s2 = s3;
            s3 = s1 + s2;
        }
        return s3;
    }
}
