package com.wangb.arith.hash.anagram;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram242_2 {
    public boolean isAnagram1(String s, String t) {
        System.out.println("s=" + s + ", t=" + t);
        if (s.length() != t.length()) {
            return false;
        }
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals(sChars, tChars);
    }

    @Test
    public void testIsAnagram1() {
        System.out.println(isAnagram1("anagram", "nagaram"));

        System.out.println(isAnagram1("rat", "car"));

        System.out.println(isAnagram1("a", "b"));

        System.out.println(isAnagram1("anagram", "nagarm"));

        System.out.println(isAnagram1("", ""));
    }


    public boolean isAnagram2(String s, String t) {
        System.out.println("s=" + s + ", t=" + t);
        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < counter.length; i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void testIsAnagram3() {
        System.out.println(isAnagram2("anagram", "nagaram"));

        System.out.println(isAnagram2("rat", "car"));

        System.out.println(isAnagram2("a", "b"));

        System.out.println(isAnagram2("anagram", "nagarm"));

        System.out.println(isAnagram2("aacc", "ccac"));
    }
}
