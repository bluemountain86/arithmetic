package com.wangb.arith.stack.validparentheses;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-06 15:53:08
 */
public class ValidParentheses20_1 {
    public boolean validParentheses(String s) {
        if (s == null || (s.trim().length()) % 2 == 1) {
            return false;
        }

        Map<Character, Character> symPairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};

        Stack<Character> symStack = new Stack<>();
        char[] charArray = s.toCharArray();
        char tmpChar;
        for (int i = 0; i < charArray.length; i++) {
            tmpChar = charArray[i];
            if (symPairs.containsKey(tmpChar)) {
                if (symStack.isEmpty() || !symStack.peek().equals(symPairs.get(tmpChar))) {
                    return false;
                }
                symStack.pop();
            } else {
                symStack.push(tmpChar);
            }
        }

        return symStack.isEmpty();
    }

    @Test
    public void testValidParentheses() {
        String sym1 = "{()}[]";
        System.out.println(sym1 + "---->" + validParentheses(sym1));
        String sym2 = "{}";
        System.out.println(sym2 + "---->" + validParentheses(sym2));
        String sym3 = "{}}";
        System.out.println(sym3 + "---->" + validParentheses(sym3));
        String sym4 = "{}()";
        System.out.println(sym4 + "---->" + validParentheses(sym4));
    }
}
