package com.wangb.arith.binarysearch.mysqrt;

import org.junit.Test;

/**
 * @Author wangbin
 * @Date 2020/12/29
 */
public class MySqrt69_3 {

    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid <= x) {
                left = mid + 1;
                ans = mid;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    @Test
    public void mySqrt() {
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
        System.out.println(mySqrt(9));
        System.out.println(mySqrt(10));
    }
}
