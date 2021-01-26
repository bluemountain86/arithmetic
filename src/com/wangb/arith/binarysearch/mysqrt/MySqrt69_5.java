package com.wangb.arith.binarysearch.mysqrt;

import org.junit.Test;

/**
 * @Author wangbin
 * @Date 2021/1/26
 */
public class MySqrt69_5 {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long tmpSqr = (long) mid * mid;
            if (tmpSqr <= x) {
                left = mid + 1;
                ans = mid;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    @Test
    public void testMySqrt() {
        System.out.println(mySqrt(1));
        System.out.println(mySqrt(2));
        System.out.println(mySqrt(3));
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
        System.out.println(mySqrt(16));
        System.out.println(mySqrt(36));
        System.out.println(mySqrt(35));
        System.out.println(mySqrt(49));
        System.out.println(mySqrt(400));
        System.out.println(mySqrt(1024));
        System.out.println(mySqrt(1023));
        System.out.println(mySqrt(1025));
        System.out.println(mySqrt(2147395599));
    }
}
