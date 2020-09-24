package com.wangb.arith.hash.groupnagrams;

import java.util.*;

public class GroupAnagrams49_4 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupList = new ArrayList<>();
        if (strs == null && strs.length == 0) {
            return groupList;
        }
        Map<String, List<String>> strMap = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = Arrays.toString(chars);
            if (!strMap.containsKey(key)) {
                strMap.put(key, new ArrayList<>());
            }
            strMap.get(key).add(str);
        }
        groupList.addAll(strMap.values());
        return groupList;
    }
}
