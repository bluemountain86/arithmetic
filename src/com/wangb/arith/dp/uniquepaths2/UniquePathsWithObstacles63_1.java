package com.wangb.arith.dp.uniquepaths2;

/**
 * @Author wangbin
 * @Date 2021/1/3
 */
public class UniquePathsWithObstacles63_1 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] path = new int[n];
        path[0] = obstacleGrid[0][0] == 1 ? 0 : 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    path[j] = 0;
                    continue;
                }
                if (j - 1 >= 0 && obstacleGrid[i][j - 1] == 0) {
                    path[j] += path[j - 1];
                }
            }
        }
        return path[n - 1];
    }
}
