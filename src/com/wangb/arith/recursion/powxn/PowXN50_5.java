package com.wangb.arith.recursion.powxn;

/**
 * @Author wangbin
 * @Date 2020/12/10
 */
public class PowXN50_5 {
    public double myPow(double x, int n) {
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        return pow(x, n);
    }

    public double pow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double half = pow(x, n / 2);
        return n % 2 == 0 ? half * half : half * half * x;
    }
}
