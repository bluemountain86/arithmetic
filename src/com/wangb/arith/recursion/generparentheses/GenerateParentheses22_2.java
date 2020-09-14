package com.wangb.arith.recursion.generparentheses;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-13 21:28:59
 */
public class GenerateParentheses22_2 {
    public List<String> generateParentheses(int n) {
        List<String> stringList = new ArrayList<>();
        generate(0, 0, n, "", stringList);
        return stringList;
    }

    private void generate(int left, int right, int n, String s, List<String> stringList) {
        if (left == n && right == n) {
            stringList.add(s);
            return;
        }
        if (left < n) {
            generate(left + 1, right, n, s + "(", stringList);
        }
        if (left > right) {
            generate(left, right + 1, n, s + ")", stringList);
        }
    }

    @Test
    public void testGenerateParenthesis() {
        System.out.println(generateParentheses(3));
    }
}
