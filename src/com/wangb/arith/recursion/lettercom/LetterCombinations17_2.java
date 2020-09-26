package com.wangb.arith.recursion.lettercom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-26 22:32:26
 */
public class LetterCombinations17_2 {
    public List<String> letterCombinations(String digits) {
        List<String> strList = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return strList;
        }

        Map<Character, String> keyMap = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};
        backtrack("", digits, 0, strList, keyMap);
        return strList;
    }

    private void backtrack(String s, String digits, int i, List<String> strList, Map<Character, String> keyMap) {
        if (i == digits.length()) {
            strList.add(s);
            return;
        }
        String letters = keyMap.get(digits.charAt(i));
        for (int j = 0; j < letters.length(); j++) {
            backtrack(s + letters.charAt(j), digits, i + 1, strList, keyMap);
        }
    }
}
