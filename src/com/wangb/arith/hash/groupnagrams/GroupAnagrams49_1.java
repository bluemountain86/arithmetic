package com.wangb.arith.hash.groupnagrams;

import org.junit.Test;

import java.util.*;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-10 23:23:34
 */
public class GroupAnagrams49_1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        List<List<String>> lists = new ArrayList<List<String>>();
        if (strs == null || strs.length == 0) {
            return lists;
        }
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                List<String> list = new ArrayList<String>();
                list.add(str);
                map.put(key, list);
            }
        }
        for (List<String> list : map.values()) {
            lists.add(list);
        }

        return lists;
    }

    @Test
    public void testGroupAnagrams() {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }

}
