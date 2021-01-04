package com.wangb.arith.binarysearch.mysqrt;

import org.junit.Test;

/**
 * @Author wangbin
 * @Date 2021/1/4
 */
public class MySqrt69_4 {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sqrty = (long) mid * mid;
            if (sqrty <= x) {
                ans = mid;
                left = mid + 1;
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


    public void mid(int x) {
        int left = 0;
        int right = x;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sqrty = (long) mid * mid;
            System.out.println("left=" + left + ",right=" + right + ", mid=" + mid);
            if (sqrty <= x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }

    @Test
    public void testMid() {
        mid(1024);
    }

}
