package com.wangb.arith.hash.anagram;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.CheckedOutputStream;

public class Anagram242_4 {
    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] counter = new int[26];

        for (int i = 0; i < s.length(); i++) {
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

}
