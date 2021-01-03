package com.wangb.arith.dp.fib;

import org.junit.Test;

/**
 * @Author wangbin
 * @Date 2021/1/3
 */
public class Fib_1 {
    public int fib(int n) {
        return n <= 1 ? n : fib(n - 1) + fib(n - 2);
    }

    @Test
    public void testFib() {
        System.out.println(fib(10));
    }
}
