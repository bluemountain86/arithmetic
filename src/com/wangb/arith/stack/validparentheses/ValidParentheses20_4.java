package com.wangb.arith.stack.validparentheses;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses20_4 {

    public boolean isValid(String s) {

        if (s == null || s.length() % 2 == 1) {
            return false;
        }

        Map<Character, Character> symPairs = new HashMap<Character, Character>() {{
            put('}', '{');
            put(')', '(');
            put(']', '[');
        }};

        char[] chars = s.toCharArray();
        Stack<Character> charStack = new Stack<Character>();
        for (int i = 0; i < chars.length; i++) {
            if (symPairs.containsKey(chars[i])) {
                if (charStack.isEmpty() || !charStack.peek().equals(symPairs.get(chars[i]))) {
                    return false;
                }
                charStack.pop();
            } else {
                charStack.push(chars[i]);
            }
        }

        return charStack.isEmpty();
    }

    @Test
    public void testValidParentheses() {
        String sym1 = "{()}[]";
        System.out.println(sym1 + "---->" + isValid(sym1));
        String sym2 = "{}";
        System.out.println(sym2 + "---->" + isValid(sym2));
        String sym3 = "}}";
        System.out.println(sym3 + "---->" + isValid(sym3));
        String sym4 = "{}()";
        System.out.println(sym4 + "---->" + isValid(sym4));
        String sym5 = "}{()";
        System.out.println(sym5 + "---->" + isValid(sym5));
    }

}
