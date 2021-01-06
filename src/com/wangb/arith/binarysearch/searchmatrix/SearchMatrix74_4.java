package com.wangb.arith.binarysearch.searchmatrix;

/**
 * @Author wangbin
 * @Date 2021/1/6
 */
public class SearchMatrix74_4 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length * matrix[0].length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int index1 = mid / matrix[0].length;
            int index2 = mid % matrix[0].length;
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
}
