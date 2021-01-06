package com.wangb.arith.binarysearch.perfectsquare;

import org.junit.Test;

/**
 * @Author wangbin
 * @Date 2021/1/6
 */
public class PerfectSquare367_4 {
    public boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sqr = (long) mid * mid;
            if (num == sqr) {
                return true;
            } else if (num < sqr) {
                right = mid - 1;
            } else {
                left = mid + 1;
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
