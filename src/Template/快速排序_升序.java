package Template;

import java.util.Arrays;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: Kkoo
 * Date: 2021/11/24 0024 14:36
 * FileName: 快速排序
 */
public class 快速排序_升序 {
    public static void main(String[] args) {
        int [] arr = {324,23,4,234,2,35234,54,2314,12,3,123,12,4,32,54,235,34,5,234,231};
        sx(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sx(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int temp = arr[i];
        while (i < j) {
            while (i < j && temp <= arr[j]) {
                j--;
            }
            if (i < j) {
                arr[i] = arr[j];
                i++;
            }
            while (i < j && temp >= arr[i]) {
                i++;
            }
            if (i < j) {
                arr[j] = arr[i];
                j--;
            }
        }
        arr[i] = temp;
        if (low < i) {
            sx(arr, low, i - 1);
        }
        if (i < high) {
            sx(arr, i + 1, high);
        }
    }
}