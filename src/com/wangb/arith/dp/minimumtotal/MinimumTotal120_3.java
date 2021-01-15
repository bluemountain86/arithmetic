package com.wangb.arith.dp.minimumtotal;

import java.util.List;

public class MinimumTotal120_3 {
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
        Integer[][] dp = new Integer[size][size];
        return dfs(triangle, 0, 0, dp);
    }

    private int dfs(List<List<Integer>> triangle, int i, int j, Integer[][] dp) {
        if (i >= triangle.size()) {
            return 0;
        }
        if (dp[i][j] != null) {
            return dp[i][j];
        }
        return dp[i][j] = Math.min(dfs(triangle, i + 1, j, dp), dfs(triangle, i + 1, j + 1, dp)) + triangle.get(i).get(j);
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

    public int minimumTotal34(List<List<Integer>> triangle) {
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
