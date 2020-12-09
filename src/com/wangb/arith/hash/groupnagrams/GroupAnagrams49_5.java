package com.wangb.arith.hash.groupnagrams;

import java.util.*;

/**
 * @Author wangbin
 * @Date 2020/12/8
 */
public class GroupAnagrams49_5 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> strList = new ArrayList<>();
        if (strs == null || strs.length == 0) {
            return strList;
        }
        Map<String, List<String>> mapStr = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = Arrays.toString(chars);
            if (mapStr.containsKey(key)) {
                mapStr.get(key).add(str);
            } else {
                List<String> tmpList = new ArrayList<String>();
                tmpList.add(str);
                mapStr.put(key, tmpList);
            }
        }
        strList.addAll(mapStr.values());
        return strList;
    }
}
