package com.wangb.arith.hash.anagram;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-10 21:51:27
 */
public class Anagram242_1 {
    public boolean isAnagram1(String s, String t) {
        System.out.println("s=" + s + ", t=" + t);
        if (s.length() != t.length()) {
            return false;
        }
        char[] ssort = s.toCharArray();
        Arrays.sort(ssort);
        char[] tsort = t.toCharArray();
        Arrays.sort(tsort);
        return Arrays.equals(ssort, tsort);
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
        Map<Character, Integer> sCounterMap = new HashMap<Character, Integer>();
        count(sCounterMap, s);
        Map<Character, Integer> tCounterMap = new HashMap<Character, Integer>();
        count(tCounterMap, t);

        return (compareMap(sCounterMap, tCounterMap) && compareMap(tCounterMap, sCounterMap));
    }

    private void count(Map<Character, Integer> counterMap, String s) {
        for (char c : s.toCharArray()) {
            if (counterMap.containsKey(c)) {
                int counter = counterMap.get(c);
                counter++;
                counterMap.put(c, counter);
            } else {
                counterMap.put(c, new Integer(1));
            }
        }
    }

    private boolean compareMap(Map<Character, Integer> a, Map<Character, Integer> b) {
        for (Character c : a.keySet()) {
            if (a.containsKey(c)) {
                if (a.get(c).equals(b.get(c))) {
                    continue;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }

    @Test
    public void testIsAnagram2() {
        System.out.println(isAnagram2("anagram", "nagaram"));

        System.out.println(isAnagram2("rat", "car"));

        System.out.println(isAnagram2("a", "b"));

        System.out.println(isAnagram2("anagram", "nagarm"));

        System.out.println(isAnagram2("aacc", "ccac"));
    }

    public boolean isAnagram3(String s, String t) {
        System.out.println("s=" + s + ", t=" + t);
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

    @Test
    public void testIsAnagram3() {
        System.out.println(isAnagram3("anagram", "nagaram"));

        System.out.println(isAnagram3("rat", "car"));

        System.out.println(isAnagram3("a", "b"));

        System.out.println(isAnagram3("anagram", "nagarm"));

        System.out.println(isAnagram3("aacc", "ccac"));
    }
}