package com.wangb.arith.dp.lsubsequence;

/**
 * @Author wangbin
 * @Date 2021/1/8
 */
public class LongestCommonSubsequence1143_1 {
    public int longestCommonSubsequence(String text1, String text2) {
        if (text1 == null || text1.length() <= 0 || text2 == null || text2.length() <= 0) {
            return 0;
        }
        int m = text1.length();
        int n = text2.length();
        int[][] db = new int[m + 1][n + 1];
        for (int i = 0; i < m; i++) {
            char char1 = text1.charAt(i);
            for (int j = 0; j < n; j++) {
                char char2 = text2.charAt(j);
                if (char1 == char2) {
                    db[i + 1][j + 1] = db[i][j] + 1;
                } else {
                    db[i + 1][j + 1] = Math.max(db[i + 1][j], db[i][j + 1]);
                }
            }
        }
        return db[m][n];
    }
}
