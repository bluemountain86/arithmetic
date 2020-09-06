package com.wangb.arith.arry.climbstairs;

import org.junit.Test;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-01 22:20:06
 */
public class ClimbStairs70_1 {
    public int climbStairs1(int step) {
        if(step <= 2) {
            return step;
        }
        int s1 = 1;
        int s2 = 2;
        int s3 = 3;

        for(int i = 3; i <= step; i ++) {
            s3 = s2 + s1;
            s1 = s2;
            s2 = s3;
        }

        return s3;
    }

    @Test
    public void testClimbStairs1() {
        for (int i = 0; i < 6; i++) {
            System.out.println("step:" + i + ":" + climbStairs1(i));
        }
    }
}
