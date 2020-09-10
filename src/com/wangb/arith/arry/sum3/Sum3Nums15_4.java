package com.wangb.arith.arry.sum3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-10 20:50:31
 */
public class Sum3Nums15_4 {
    public List<List<Integer>> sum3Nums(int[] nums) {
        List<List<Integer>> array = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return array;
        }
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                } else if (sum == 0) {
                    List<Integer> tmpArray = new ArrayList<>();
                    tmpArray.add(nums[i]);
                    tmpArray.add(nums[j]);
                    tmpArray.add(nums[k]);
                    array.add(tmpArray);
                    j++;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    k--;
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                } else {
                    k--;
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }

        return array;
    }

    @Test
    public void testSum3Nums() {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(sum3Nums(nums));
        nums = new int[]{-2, 0, 0, 2, 2};
        System.out.println(sum3Nums(nums));
        nums = new int[]{-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6};
        System.out.println(sum3Nums(nums));
    }
}
