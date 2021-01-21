package com.wangb.arith.dp.coinchange;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author wangbin
 * @Date 2021/1/15
 */
public class CoinChange322_1 {
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[max];
        Arrays.fill(dp, max);
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    @Test
    public void testCoinChange() {
        int[] coins = new int[]{1, 2, 5};
//        System.out.println(coinChange(coins, 11));

//        int[] coins2 = new int[]{2};
//        System.out.println(coinChange(coins2, 3));

        int[] coins3 = new int[]{186, 419, 83, 408};
        System.out.println(coinChange(coins3, 6249));

    }

}
