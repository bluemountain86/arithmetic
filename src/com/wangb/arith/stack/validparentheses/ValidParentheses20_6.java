package com.wangb.arith.stack.validparentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @Author wangbin
 * @Date 2020/12/14
 */
public class ValidParentheses20_6 {
    public boolean isValid(String s) {
        if (s == null || s.length() % 2 != 0) {
            return false;
        }
        Map<Character, Character> pairs = new HashMap<Character, Character>() {
            {
                put(')', '(');
                put('}', '{');
                put(']', '[');
            }
        };

        Stack<Character> chars = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            if (pairs.containsKey(key)) {
                if (!chars.isEmpty() || !chars.peek().equals(pairs.get(key))) {
                    return false;
                }
                chars.pop();
            } else {
                chars.push(key);
            }
        }

        return chars.isEmpty();
    }
}
