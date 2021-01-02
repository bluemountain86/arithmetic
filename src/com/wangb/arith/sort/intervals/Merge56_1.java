package com.wangb.arith.sort.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Author wangbin
 * @Date 2021/1/2
 */
public class Merge56_1 {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length < 2) {
            return intervals;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        List<int[]> mergeList = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int l = intervals[i][0];
            int r = intervals[i][1];
            if (mergeList.isEmpty() || mergeList.get(mergeList.size() - 1)[1] < l) {
                mergeList.add(new int[]{l, r});
            } else {
//                mergeList.get(mergeList.size() - 1)[1] = r;
//                [[1,4],[2,3]]
                mergeList.get(mergeList.size() - 1)[1] = Math.max(mergeList.get(mergeList.size() - 1)[1], r);
            }
        }
        return mergeList.toArray(new int[mergeList.size()][]);
    }
}
