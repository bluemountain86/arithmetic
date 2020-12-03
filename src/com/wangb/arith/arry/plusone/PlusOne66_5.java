package com.wangb.arith.arry.plusone;

public class PlusOne66_5 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if ((digits[i] + 1) % 10 != 0) {
                digits[i] = digits[i] + 1;
                return digits;
            }

            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
