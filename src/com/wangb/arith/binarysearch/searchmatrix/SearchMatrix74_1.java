package com.wangb.arith.binarysearch.searchmatrix;

import org.junit.Test;

/**
 * @Author wangbin
 * @Date 2020/12/30
 */
public class SearchMatrix74_1 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length * matrix[0].length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int index1 = mid / matrix[0].length;
//            int index2 = mid - (matrix[0].length * index1);
            int index2 = mid % matrix[0].length;
            System.out.println(mid + ":[" + index1 + "]" + "[" + index2 + "] = " + matrix[index1][index2]);
            if (matrix[index1][index2] == target) {
                return true;
            } else if (matrix[index1][index2] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    @Test
    public void testMatrix() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        int length = matrix.length * matrix[0].length;
        System.out.println("length1:" + matrix.length);
        System.out.println("length2:" + matrix[0].length);

        for (int i = 0; i < length; i++) {
            int index1 = i / matrix[0].length;
            int index2 = i - (matrix[0].length * index1);
            System.out.println(i + "-->[" + index1 + "]" + "[" + index2 + "]");
        }
        System.out.println(searchMatrix(matrix, 16));
    }
}