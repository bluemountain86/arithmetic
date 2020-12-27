package com.wangb.arith.recursion.lettercom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations17_7 {
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
        combinate("", digits, 0, strList, keyMap);
        return strList;
    }

    private void combinate(String s, String digits, int length, List<String> strList, Map<Character, String> keyMap) {
        if (length == digits.length()) {
            strList.add(s);
            return;
        }
        String keys = keyMap.get(digits.charAt(length));
        for (int i = 0; i < keys.length(); i++) {
            combinate(s + keys.charAt(i), digits, length + 1, strList, keyMap);
        }
    }

}
