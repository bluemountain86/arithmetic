package com.wangb.arith.hash.groupnagrams;

import org.junit.Test;

import java.util.*;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-12 15:38:49
 */
public class GroupAnagrams49_3 {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> groupList = new ArrayList<List<String>>();

        if (strs == null && strs.length == 0) {
            return groupList;
        }
        Map<String, List<String>> mapList = new HashMap<String, List<String>>();

        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (mapList.containsKey(key)) {
                mapList.get(key).add(strs[i]);
            } else {
                List<String> strList = new ArrayList<>();
                strList.add(strs[i]);
                mapList.put(key, strList);
            }
        }

        for (List<String> strList : mapList.values()) {
            groupList.add(strList);
        }

        return groupList;
    }

    @Test
    public void testGroupAnagrams() {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
}
