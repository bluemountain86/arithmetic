package com.wangb.arith.stack.validparentheses;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @Author wangbin
 * @Date 2020/12/11
 */
public class ValidParentheses20_5 {
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
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            if (pairs.containsKey(key)) {
                if (stack.isEmpty() || !pairs.get(key).equals(stack.pop())) {
                    return false;
                }
            } else {
                stack.push(key);
            }
        }
        return stack.isEmpty();
    }

    @Test
    public void testValidParentheses() {
        String sym1 = "{()}[]";
        System.out.println(sym1 + "---->" + isValid(sym1));
        String sym2 = "{}";
        System.out.println(sym2 + "---->" + isValid(sym2));
        String sym3 = "{}}";
        System.out.println(sym3 + "---->" + isValid(sym3));
        String sym4 = "{}()";
        System.out.println(sym4 + "---->" + isValid(sym4));
    }
}
