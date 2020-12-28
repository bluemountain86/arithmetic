package com.wangb.arith.binarysearch.mysqrt;

/**
 * @Author wangbin
 * @Date 2020/12/28
 */
public class MySqrt69_2 {
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
}
