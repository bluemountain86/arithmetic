package com.wangb.arith.greed.maxrofit2;

/**
 * @Author wangbin
 * @Date 2021/1/5
 */
public class MaxProfit122_4 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            maxProfit += Math.max(0, prices[i] - prices[i - 1]);
        }
        return maxProfit;
    }
}
