package com.wangb.arith.recursion.powxn;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-26 20:38:22
 */
public class PowXN50_1 {
    public double myPow(double x, int n) {
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        return fastPow(x, n);
    }

    public double fastPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        double half = fastPow(x, n / 2);
        return n % 2 == 0 ? half * half : half * half * x;
    }
}
