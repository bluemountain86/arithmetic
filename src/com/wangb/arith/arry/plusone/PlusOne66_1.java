package com.wangb.arith.arry.plusone;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-16 19:44:08
 */
public class PlusOne66_1 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    @Test
    public void testPlusOne() {
        int[] digits = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(plusOne(digits)));

        digits = new int[]{9, 9, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
