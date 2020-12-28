package com.wangb.arith.binarysearch.perfectsquare;

import org.junit.Test;

/**
 * @Author wangbin
 * @Date 2020/12/28
 */
public class PerfectSquare367_2 {
    public boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }
        long left = 0;
        long right = num;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long sqr = mid * mid;
            if (sqr == num) {
                return true;
            } else if (sqr < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    @Test
    public void testIsPerfectSquare() {
        System.out.println(isPerfectSquare(0));

        System.out.println(isPerfectSquare(1));

        System.out.println(isPerfectSquare(4));

        System.out.println(isPerfectSquare(5));

        System.out.println(isPerfectSquare(6));

        System.out.println(isPerfectSquare(16));

        System.out.println(isPerfectSquare(33));

        System.out.println(isPerfectSquare(36));
    }
}
