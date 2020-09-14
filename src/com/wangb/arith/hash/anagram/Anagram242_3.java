package com.wangb.arith.hash.anagram;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-12 14:44:08
 */
public class Anagram242_3 {
    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();
        Arrays.sort(sSort);
        Arrays.sort(tSort);

        return Arrays.equals(sSort, tSort);
    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int len = s.length();
        int[] counter = new int[26];
        for (int i = 0; i < len; i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < len; i++) {
            if (counter[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void testIsAnagram1() {
        System.out.println(isAnagram1("anagram", "nagaram"));

        System.out.println(isAnagram1("rat", "car"));

        System.out.println(isAnagram1("a", "b"));

        System.out.println(isAnagram1("anagram", "nagarm"));

        System.out.println(isAnagram1("", ""));
    }

    @Test
    public void testIsAnagra2() {
        System.out.println(isAnagram2("anagram", "nagaram"));

        System.out.println(isAnagram2("rat", "car"));

        System.out.println(isAnagram2("a", "b"));

        System.out.println(isAnagram2("anagram", "nagarm"));

        System.out.println(isAnagram2("aacc", "ccac"));
    }

}
