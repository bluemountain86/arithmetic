package com.wangb.arith.recursion.generparentheses;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-13 20:53:37
 */
public class GenerateParentheses22_1 {
    public List<String> generateParentheses(int n) {
        List<String> strList = new ArrayList<>();

        generate(0, 0, n, "", strList);

        return strList;
    }

    private void generate(int left, int right, int n, String s, List<String> strList) {
        if (left == n && right == n) {
            strList.add(s);
            return;
        }

        if (left < n) {
            generate(left + 1, right, n, s + "(", strList);
        }
        if (left > right) {
            generate(left, right + 1, n, s + ")", strList);
        }
    }

    @Test
    public void testGenerateParenthesis() {
        System.out.println(generateParentheses(3));
    }
}
