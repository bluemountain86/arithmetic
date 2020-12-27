package com.wangb.arith.greed.findcontentchildren;

import java.util.Arrays;

/**
 * @Author wangbin
 * @Date 2020/12/27
 */
public class FindContentChildren455_2 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int numOfChildren = g.length;
        int numOfContent = s.length;
        for (int i = 0, j = 0; i < numOfChildren && j < numOfContent; i++, j++) {
            while (j < numOfContent && g[i] > s[j]) {
                j++;
            }
            if (j < numOfContent) {
                ++count;
            }
        }
        return count;
    }
}
