package com.wangb.arith.hash.groupnagrams;

import org.junit.Test;

import java.util.*;

public class GroupAnagrams49_2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupAnagrams = new ArrayList<List<String>>();
        if (strs == null || strs.length < 2) {
            return groupAnagrams;
        }

        Map<String, List<String>> strMap = new HashMap<String, List<String>>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (strMap.containsKey(key)) {
                strMap.get(key).add(strs[i]);
            } else {
                List<String> tmpList = new ArrayList<>();
                tmpList.add(strs[i]);
                strMap.put(key, tmpList);
            }
        }

        for (List<String> strList : strMap.values()) {
            groupAnagrams.add(strList);
        }

        return groupAnagrams;
    }

    @Test
    public void testGroupAnagrams() {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
}
