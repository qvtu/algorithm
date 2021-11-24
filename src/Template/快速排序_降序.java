package Template;

import java.util.Arrays;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: Kkoo
 * Date: 2021/11/24 0024 14:36
 * FileName: 快速排序
 */
public class 快速排序_降序 {
    public static void main(String[] args) {
        int[] arr = {324, 23, 4, 234, 2, 35234, 54, 2314, 12, 3, 123, 12, 4, 32, 54, 235, 34, 5, 234, 231};
        jx(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void jx(int[] arr, int high, int low) {
        int t;
        int i = high;
        int j = low;
        int temp = arr[high];
        while (i < j) {
            while (i < j && temp >= arr[j]) {
                j--;
            }
            while (i < j && temp <= arr[i]) {
                i++;
            }
            if (i < j) {
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        arr[high]=arr[i];
        arr[i] = temp;
        if (high < i) {
            jx(arr, high, i - 1);
        }
        if (i < low) {
            jx(arr, i + 1, low);
        }
    }
}
