package com.wangb.arith.sort.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Author wangbin
 * @Date 2021/1/2
 */
public class Merge56_2 {
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
        List<int[]> merge = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int min = intervals[i][0];
            int max = intervals[i][1];
            if (merge.isEmpty() || merge.get(merge.size() - 1)[1] < min) {
                merge.add(new int[]{min, max});
            } else {
                merge.get(merge.size() - 1)[1] = Math.max(merge.get(merge.size() - 1)[1], max);
            }
        }
        return merge.toArray(new int[][]{});
    }
}
