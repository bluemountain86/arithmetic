package com.wangb.arith.greed.maxrofit2;

/**
 * @Author wangbin
 * @Date 2020/12/29
 */
public class MaxProfit122_3 {
    public int maxProift(int[] prices) {
        int maxProift = 0;

        if (prices == null || prices.length < 2) {
            return maxProift;
        }

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProift += prices[i] - prices[i - 1];
            }
        }
        return maxProift;
    }
}
