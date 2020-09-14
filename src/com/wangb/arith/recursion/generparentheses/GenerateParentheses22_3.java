package com.wangb.arith.recursion.generparentheses;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses22_3 {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        generate(0, 0, n, "", list);
        return list;
    }

    private void generate(int left, int right, int n, String s, List<String> list) {
        if (left == n && left == right) {
            list.add(s);
            return;
        }
        if (left < n) {
            generate(left + 1, right, n, s + "(", list);
        }
        if (right < left) {
            generate(left, right + 1, n, s + ")", list);
        }
    }

    @Test
    public void testGenerateParenthesis() {
        System.out.println(generateParenthesis(3));
    }

}
