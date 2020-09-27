package com.wangb.arith.recursion.lettercom;

import javax.swing.text.Keymap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations17_3 {
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
        backtrack("", 0, keyMap, strList, digits);
        return strList;
    }

    public void backtrack(String s, int level, Map<Character, String> keyMap, List<String> strList, String digits) {
        if (level == digits.length()) {
            strList.add(s);
            return;
        }

        String keys = keyMap.get(digits.charAt(level));

        for (int i = 0; i < keys.length(); i++) {
            backtrack(s + keys.charAt(i), level + 1, keyMap, strList, digits);
        }

    }
}
