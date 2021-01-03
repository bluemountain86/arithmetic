package com.wangb.arith.dp.fib;

import org.junit.Test;

/**
 * @Author wangbin
 * @Date 2021/1/3
 */
public class Fib_2 {
    public long fib(int n, long[] memo) {
        if (n <= 1) {
            return n;
        }
        if (memo[n] == 0) {
            memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
            System.out.println(n + "------>" +memo[n]);
        }
        return memo[n];
    }

    private int fib(int n) {
        return n <= 1 ? n : fib(n - 1) + fib(n - 2);
    }

    @Test
    public void testFib() {
        int n = 50;
        long[] memo = new long[n + 1];
        System.out.println(fib(n, memo));
    }
}
