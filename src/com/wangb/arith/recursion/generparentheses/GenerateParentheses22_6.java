package com.wangb.arith.recursion.generparentheses;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wangbin
 * @Date 2020/12/10
 */
public class GenerateParentheses22_6 {
    public List<String> generateParenthesis(int n) {
        List<String> strList = new ArrayList<>();
        generate("", 0, 0, n, strList);
        return strList;
    }

    public void generate(String s, int left, int right, int maxLevel, List<String> strList) {
        if (left == right && left == maxLevel) {
            strList.add(s);
            return;
        }

        if (left < maxLevel) {
            generate(s + "(", left + 1, right, maxLevel, strList);
        }
        if (left > right) {
            generate(s + ")", left, right + 1, maxLevel, strList);
        }
    }
}
