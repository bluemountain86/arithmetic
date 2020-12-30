package com.wangb.arith.binarysearch.searchmatrix;

/**
 * @Author wangbin
 * @Date 2020/12/30
 */
public class SearchMatrix74_2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int left = 0;
        int right = matrix.length * matrix[0].length - 1;
        int midIndex = 0;
        int midVal = 0;
        int length = matrix[0].length;
        while (left <= right) {
            midIndex = left + (right - left) / 2;
            midVal = matrix[midIndex / length][midIndex % length];
            if (midVal == target) {
                return true;
            } else if (midVal < target) {
                left = midIndex + 1;
            } else {
                right = midIndex - 1;
            }
        }
        return false;
    }
}
