package com.wangb.arith.dp.uniquepaths;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author wangbin
 * @Date 2021/1/23
 */
public class UniquePaths62_5 {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }
        return dp[m - 1][n - 1];
    }

    @Test
    public void testUniquePaths() {
        System.out.println(uniquePaths(2, 3));
    }

    public int uniquePaths2(int m, int n) {
        int[] grids = new int[n];
        Arrays.fill(grids, 1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grids[j] += grids[j - 1];
            }
        }
        return grids[n - 1];
    }
}
