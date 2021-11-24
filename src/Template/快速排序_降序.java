package Template;

import java.util.Arrays;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: Kkoo
 * Date: 2021/11/24 0024 14:36
 * FileName: 快速排序_降序
 */
public class 快速排序_降序 {
    //降序就把升序反过来
    public static void main(String[] args) {
        int[] arr = {324, 23, 4, 234, 2, 35234, 54, 2314, 12, 3, 123, 12, 4, 32, 54, 235, 34, 5, 234, 231};
        jx(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void jx(int[] arr, int right, int left) {
        int i = right;
        int j = left;
        int temp = arr[right];
        while (i < j) {
            while (i < j && temp >= arr[j]) {
                j--;
            }
            while (i < j && temp <= arr[i]) {
                i++;
            }
            if (i < j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        arr[right] = arr[i];
        arr[i] = temp;
        if (right < i) {
            jx(arr, right, i - 1);
        }
        if (i < left) {
            jx(arr, i + 1, left);
        }
    }
}
