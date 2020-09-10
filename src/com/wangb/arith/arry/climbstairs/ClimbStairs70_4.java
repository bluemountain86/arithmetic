package com.wangb.arith.arry.climbstairs;

import org.junit.Test;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-02 23:25:50
 */
public class ClimbStairs70_4 {
    public int climbStairs(int step) {
        if(step < 3) {
            return step;
        }

        int s1 = 1;
        int s2 = 2;
        int s3 = 0;

        for (int i = 3; i <= step ; i++) {
            s3 = s1 + s2;
            s1 = s2;
            s2 = s3;
        }

        return s3;
    }

    @Test
    public void testClimbStairs1() {
        for (int i = 0; i < 8; i++) {
            System.out.println("step:" + i + ":" + climbStairs(i));
        }
    }
}
