package com.wangb.arith.sort.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Author wangbin
 * @Date 2021/1/11
 */
public class Merge56_4 {
    public int[][] merge(int[][] intervals) {
//[[1,3],[2,6],[8,10],[15,18]]
        if (intervals.length < 2) {
            return intervals;
        }

        List<int[]> resultLsit = new ArrayList<>();
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        for (int i = 0; i < intervals.length; i++) {
            int left = intervals[i][0];
            int right = intervals[i][1];
            if (resultLsit.isEmpty() || resultLsit.get(resultLsit.size() - 1)[1] < left) {
                resultLsit.add(new int[]{left, right});
            } else {
                resultLsit.get(resultLsit.size() - 1)[1] = Math.max(right, resultLsit.get(resultLsit.size() - 1)[1]);
            }
        }

        return resultLsit.toArray(new int[][]{});
    }
}
