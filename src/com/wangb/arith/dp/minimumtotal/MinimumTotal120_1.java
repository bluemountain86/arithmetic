package com.wangb.arith.dp.minimumtotal;

import java.util.List;

/**
 * @Author wangbin
 * @Date 2021/1/8
 */
public class MinimumTotal120_1 {
    /*
    [
    [2],
    [3,4],
    [6,5,7],
    [4,1,8,3]
    ]
    */
    public int minimumTotal1(List<List<Integer>> triangle) {

        Integer[][] dp = new Integer[triangle.size()][triangle.size()];

        return dfs(triangle, 0, 0, dp);
    }


    private int dfs(List<List<Integer>> triangle, int i, int j, Integer[][] dp) {
        if (i == triangle.size()) {
            return 0;
        }

        // 暴力递归搜索超时，使用缓存
        if (dp[i][j] != null) {
            return dp[i][j];
        }
        dp[i][j] = triangle.get(i).get(j) + Math.min(dfs(triangle, i + 1, j, dp), dfs(triangle, i + 1, j + 1, dp));
        return dp[i][j];
    }

    public int minimumTotal2(List<List<Integer>> triangle) {
        int size = triangle.size();
        int[][] dp = new int[size + 1][size + 1];

        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0][0];
    }

    public int minimumTotal3(List<List<Integer>> triangle) {
        int size = triangle.size();
        int[] dp = new int[size + 1];

        for (int i = size - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
    }
}
