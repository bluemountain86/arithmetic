package com.wangb.arith.dp.uniquepaths2;

import org.junit.Test;

/**
 * @Author wangbin
 * @Date 2021/1/11
 */
public class UniquePathsWithObstacles63_4 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] grids = new int[n];
        grids[0] = obstacleGrid[0][0] == 1 ? 0 : 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    grids[j] = 0;
                } else if (j > 0) {
                    grids[j] += grids[j - 1];
                }
            }
        }
        return grids[n - 1];
    }

    @Test
    public void testUniquePathsWithObstacles() {
        int[][] obstacleGrid = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }
}
