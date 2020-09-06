package com.wangb.arith.arry.sum3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-02 23:38:54
 */
public class Sum3Nums15_1 {
    public List<List<Integer>> sum3Nums(int[] nums) {
        List<List<Integer>> arrayList = new ArrayList<List<Integer>>();
        if (nums == null || nums.length < 3) {
            return arrayList;
        }
        System.out.print(Arrays.toString(nums) + " --> ");
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int k = 0; k < nums.length - 2; k++) {
            if (nums[k] > 0) {
                break;
            }
            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }
            int i = k + 1;
            int j = nums.length - 1;
            int sum = 0;
            while (i < j) {
                sum = nums[k] + nums[i] + nums[j];
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
                    arrayList.add(tempList);
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
        return arrayList;
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
