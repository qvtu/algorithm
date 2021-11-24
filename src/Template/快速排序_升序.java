package Template;

import java.util.Arrays;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: Kkoo
 * Date: 2021/11/24 0024 15:01
 * FileName: 快速排序_升序
 */
public class 快速排序_升序 {
    public static void main(String[] args) {
        int[] arr = {324, 23, 4, 234, 2, 35234, 54, 2314, 12, 3, 123, 12, 4, 32, 54, 235, 34, 5, 234, 231};
        sx(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sx(int[] arr, int left, int right) {
        //左右两个哨兵
        int i = left;
        int j = right;
        //将 arr[left] 作为基准数
        int temp = arr[left];
        //当哨兵没有相遇时运行
        while (i < j) {
            //先从右往左走 寻找比基准数小的数 i为这个数的下标
            while (i < j && temp <= arr[j]) {
                j--;
            }
            //再从左往右走 寻找比基准数大的数 j为这个数的下标
            while (i < j && temp >= arr[i]) {
                i++;
            }
            //交换位置
            if (i < j) {
                int t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        //将 基准数 和 arr[i] 交换
        arr[left] = arr[i];
        arr[i] = temp;
        //通过上面的操作 将数组分为两部分 左半部分小于arr[i] 右边部分大于arr[i]
        //对分治成两部分的数组再次进行分治
        if (left < i) {
            sx(arr, left, i - 1);
        }
        if (i < right) {
            sx(arr, i + 1, right);
        }
    }
}