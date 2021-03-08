package com.wangb.arith.binarysearch.searchmatrix;

/**
 * @Author wangbin
 * @Date 2021/3/3
 */
public class SearchMatrix74_6 {
    public boolean searchMatrix(int[][] matrix, int target) {
        //        [
        //        [1,3,5,7]
        //        [10,11,16,20]
        //        [23,30,34,60]
        //        ]
        int left = 0;
        int right = matrix[0].length * matrix.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int index1 = mid / matrix[0].length;
            int index2 = mid % matrix[0].length;
            if (matrix[index1][index2] == target) {
                return true;
            } else if (matrix[index1][index2] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
