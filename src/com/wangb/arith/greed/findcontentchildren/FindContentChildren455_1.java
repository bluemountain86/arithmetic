package com.wangb.arith.greed.findcontentchildren;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author wangbin
 * @Date 2020/12/27
 */
public class FindContentChildren455_1 {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
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

    @Test
    public void testFindContentChildren() {
        int[] g = {1, 2, 3};
        int[] s = {1, 1};
        int count = findContentChildren(g, s);
        System.out.println(count);
    }
}
