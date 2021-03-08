package com.wangb.arith.binarysearch.perfectsquare;

/**
 * @Author wangbin
 * @Date 2021/3/3
 */
public class PerfectSquare367_6 {
    public boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;
        while (left < right) {
            int mid = left + (right - left) / 2;
            long sqr = (long) mid * mid;
            if (sqr == num) {
                return true;
            } else if (sqr > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
