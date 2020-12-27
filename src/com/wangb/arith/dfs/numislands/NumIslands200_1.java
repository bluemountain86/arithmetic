package com.wangb.arith.dfs.numislands;

/**
 * @Author wangbin
 * @Date 2020/12/27
 */
public class NumIslands200_1 {
    public int numIslands(char[][] grid) {
        int counter = 0;
        if (grid == null || grid.length == 0) {
            return counter;
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    ++counter;
                    dfs(grid, i, j);
                }
            }
        }
        return counter;
    }

    private void dfs(char[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == '0') {
            return;
        }
        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }
}
