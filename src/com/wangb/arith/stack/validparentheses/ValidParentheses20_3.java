package com.wangb.arith.stack.validparentheses;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-07 21:31:23
 */
public class ValidParentheses20_3 {
    public boolean validParentheses(String s) {
        if (s == null || s.length() % 2 == 1) {
            return false;
        }
        Map<Character, Character> symPairs = new HashMap<Character, Character>() {{
            put('}', '{');
            put(']', '[');
            put(')', '(');
        }};

        Stack<Character> stack = new Stack<Character>();

        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (symPairs.containsKey(charArray[i])) {
                if (stack.isEmpty() || !symPairs.get(charArray[i]).equals(stack.peek())) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(charArray[i]);
            }
        }

        return stack.isEmpty();
    }

    @Test
    public void testValidParentheses() {
        String sym1 = "{()}[]";
        System.out.println(sym1 + "---->" + validParentheses(sym1));
        String sym2 = "{}";
        System.out.println(sym2 + "---->" + validParentheses(sym2));
        String sym3 = "}}";
        System.out.println(sym3 + "---->" + validParentheses(sym3));
        String sym4 = "{}()";
        System.out.println(sym4 + "---->" + validParentheses(sym4));
        String sym5 = "}{()";
        System.out.println(sym5 + "---->" + validParentheses(sym5));
    }
}
