package com.wangb.arith.dp.coinchange;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author wangbin
 * @Date 2021/1/15
 */
public class CoinChange322_1 {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);

        if (amount == 0) {
            return 0;
        }

        if (coins[0] > amount) {
            return -1;
        }

        int counter = 0;

        for (int i = coins.length - 1; i >= 0; i--) {
            if (amount / coins[i] > 0) {
                counter += amount / coins[i];
                amount = amount % coins[i];
                System.out.println(coins[i]);
            }
        }
        return amount > 0 ? -1 : counter;
    }

    @Test
    public void testCoinChange() {
        int[] coins = new int[]{1, 2, 5};
//        System.out.println(coinChange(coins, 11));

//        int[] coins2 = new int[]{2};
//        System.out.println(coinChange(coins2, 3));

        int[] coins3 = new int[]{186,419,83,408};
        System.out.println(coinChange(coins3, 6249));

    }

}
