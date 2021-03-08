package com.wangb.arith.binarysearch.mysqrt;

/**
 * @Author wangbin
 * @Date 2021/3/3
 */
public class MySqrt69_6 {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sqr = (long) mid * mid;
            if (sqr <= x) {
                left = mid + 1;
                ans = mid;
            } else {
                right = mid;
            }
        }
        return ans;
    }
}
