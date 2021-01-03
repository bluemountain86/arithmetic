package com.wangb.arith.dp.fib;

import org.junit.Test;

/**
 * @Author wangbin
 * @Date 2021/1/3
 */
public class Fib_3 {
    public int fib(int n) {
        int[] a = new int[n + 1];
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i <= n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[n];
    }

    @Test
    public void testFib() {
        System.out.println(fib(10));
    }
}
