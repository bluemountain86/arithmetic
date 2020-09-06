package com.wangb.arith.arry.movezeros;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-08-31 23:25:41
 */
public class MoveZeros283_2 {

    public void moveZeros(int[] nums) {
        // 当前值为0的下标
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {

                // 把非0的值跟为0的值进行位置调换，非0的值往前挪动
                nums[j] = nums[i];

                // 如果下标j小于当前下标，则标j的值为0，下标j的值（为0）往后挪动
                if (j < i) {
                    nums[i] = 0;
                }

                // 当前下标i的值不为0，坐标往后移动一位
                j++;
            }
        }
    }

    @Test
    public void testMoveZeros1() {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void moveZeros2(int[] nums) {
        int zeroIndex = nums.length;
        for (int i = 0; i < zeroIndex; i++) {
            if (nums[i] == 0) {
                for (int j = i; j < zeroIndex - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[zeroIndex - 1] = 0;
                zeroIndex = zeroIndex - 1;
                i = -1;
            }
        }
    }

    @Test
    public void testMoveZeros2() {
        int[] nums = new int[]{0, 1, 0, 0, 5, 3, 12, 0, 0};

        moveZeros2(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void moveZeros3(int[] nums) {
        if (nums == null) {
            return;
        }
        //第一次遍历的时候，j指针记录非0的个数，只要是非0的统统都赋给nums[j]
        int j = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        //非0元素统计完了，剩下的都是0了
        //所以第二次遍历把末尾的元素都赋为0即可
        for (int i = j; i < nums.length; ++i) {
            nums[i] = 0;
        }

    }

    @Test
    public void testMoveZeros3() {
        int[] nums = new int[]{0, 1, 0, 3, 12};
//        int[] nums = new int[]{0, 0, 1, 0};

        moveZeros3(nums);
        System.out.println(Arrays.toString(nums));
    }


    public void moveZeros4(int[] nums) {
        if (nums == null) {
            return;
        }

        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }

    }

    @Test
    public void testMoveZeros4() {
        int[] nums = new int[]{0, 1, 0, 3, 12};
//        int[] nums = new int[]{0, 0, 1, 0};

        moveZeros4(nums);
        System.out.println(Arrays.toString(nums));
    }

}
