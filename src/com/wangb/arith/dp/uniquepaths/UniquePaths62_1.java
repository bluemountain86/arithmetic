package com.wangb.arith.dp.uniquepaths;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author wangbin
 * @Date 2021/1/3
 */
public class UniquePaths62_1 {
    public int uniquePaths1(int m, int n) {
        int[][] grids = new int[m][n];
        for (int i = 0; i < n; i++) {
            grids[0][i] = 1;
        }

        for (int i = 0; i < m; i++) {
            grids[i][0] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grids[i][j] = grids[i - 1][j] + grids[i][j - 1];
            }
        }

        return grids[m - 1][n - 1];
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

    @Test
    public void testUniquePaths() {
        System.out.println(uniquePaths1(4, 3));
        System.out.println(uniquePaths2(4, 3));

    }
}
