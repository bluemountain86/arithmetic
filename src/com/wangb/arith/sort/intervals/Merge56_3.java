package com.wangb.arith.sort.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Author wangbin
 * @Date 2021/1/3
 */
public class Merge56_3 {
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
            int left = intervals[i][0];
            int right = intervals[i][1];
            if (merge.isEmpty() || merge.get(merge.size() - 1)[1] < left) {
                merge.add(new int[]{left, right});
            } else {
                merge.get(merge.size() - 1)[1] = Math.max(right, merge.get(merge.size() - 1)[1]);
            }
        }
        return merge.toArray(new int[][]{});
    }
}
