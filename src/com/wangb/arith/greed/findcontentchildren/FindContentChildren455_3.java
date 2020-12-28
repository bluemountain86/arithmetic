package com.wangb.arith.greed.findcontentchildren;

import java.util.Arrays;

/**
 * @Author wangbin
 * @Date 2020/12/28
 */
public class FindContentChildren455_3 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        for (int i = 0, j = 0; i < g.length && j < s.length; i++, j++) {
            while (j < s.length && g[i] > s[j]) {
                j++;
            }
            if (j < s.length) {
                count++;
            }
        }
        return count;
    }
}
