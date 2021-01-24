package com.wangb.arith.arry.plusone;

/**
 * @Author wangbin
 * @Date 2021/1/23
 */
public class PlusOne66_7 {
    public int[] plusOne(int[] digits) {
        //[1,2,3]
        for (int i = digits.length - 1; i >= 0; i--) {
            if ((digits[i] + 1) == 10) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
