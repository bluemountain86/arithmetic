package com.wangb.arith.recursion.generparentheses;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wangbin
 * @Date 2020/12/9
 */
public class GenerateParentheses22_5 {
    public List<String> generateParenthesis(int n) {
        List<String> strList = new ArrayList<>();
        generate(0, 0, "", n, strList);
        return strList;
    }

    private void generate(int left, int right, String s, int n, List<String> strList) {
        if (left == right && left == n) {
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

}
