package com.wangb.arith.dp.minimumtotal;

import java.util.List;

/**
 * @Author wangbin
 * @Date 2021/1/23
 */
public class MinimumTotal120_4 {
    /*
    [
    [2],
    [3,4],
    [6,5,7],
    [4,1,8,3]
    ]
    */
    public int minimumTotal(List<List<Integer>> triangle) {

        int size = triangle.size();
//        dp[i][j] = min(dp[i+1][j], dp[i+1][j+1]) + num[i][j]
        int[][] dp = new int[size + 1][size + 1];
        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0][0];
    }
}
