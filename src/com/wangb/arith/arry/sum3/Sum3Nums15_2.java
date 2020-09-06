package com.wangb.arith.arry.sum3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-03 20:20:49
 */
public class Sum3Nums15_2 {
    public List<List<Integer>> sum3Nums(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (nums == null && nums.length < 3) {
            return list;
        }

        Arrays.sort(nums);
        int i = 0;
        int j = 0;
        int sum = 0;
        for (int k = 0; k < nums.length - 3; k++) {
            if (nums[k] > 0) {
                break;
            }
            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }

            i = k + 1;
            j = nums.length - 1;

            while (i < j) {
                sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    i++;
                    while (i < j && nums[i] == nums[i - 1]) {
                        i++;
                    }

                } else if (sum == 0) {
                    List<Integer> tempList = new ArrayList<Integer>();
                    tempList.add(nums[k]);
                    tempList.add(nums[i]);
                    tempList.add(nums[j]);
                    list.add(tempList);
                    i++;
                    j--;
                    while (i < j && nums[i] == nums[i - 1]) {
                        i++;
                    }
                    while (i < j && nums[j] == nums[j + 1]) {
                        j--;
                    }
                } else {
                    j--;
                    while (i < j && nums[j] == nums[j + 1]) {
                        j--;
                    }
                }
            }
        }

        return list;
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
