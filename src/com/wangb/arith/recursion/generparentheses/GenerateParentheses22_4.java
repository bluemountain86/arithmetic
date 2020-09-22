package com.wangb.arith.recursion.generparentheses;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses22_4 {
    public List<String> generateParenthesis(int n) {
        List<String> strList = new ArrayList<>();
        generate(0, 0, "", n, strList);
        return strList;
    }

    private void generate(int left, int right, String s, int n, List<String> strList) {
        if (left == n && left == right) {
            strList.add(s);
            return;
        }

        if (left < n) {
            generate(left + 1, right, s + "(", n, strList);
        }

        if (right < left) {
            generate(left, right + 1, s + ")", n, strList);
        }

    }

    @Test
    public void testGenerateParenthesis() {
        System.out.println(generateParenthesis(3));
    }

}
