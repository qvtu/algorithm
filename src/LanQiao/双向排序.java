package LanQiao;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Copyright (C), 2019-2021, Kkoo
 * Author: Kkoo
 * Date: 2021/11/24 0024 0:23
 * FileName: 双向排序
 */
public class 双向排序 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedInputStream(System.in));
        //输入 n m 序列长度 操作次数
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < m; i++) {
            //cz=0 降序 cz=1 升序
            int cz = in.nextInt();
            int q = in.nextInt();
            if (cz == 0) {
                jx(arr, 0, q - 1);
            } else {
                sx(arr, q - 1, n - 1);
            }
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print(arr[n - 1]);
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


    public static void jx(int[] arr, int high, int low) {
        int i = high;
        int j = low;
        int temp = arr[i];
        while (i < j) {
            while (i < j && temp > arr[j]) {
                j--;
            }
            if (i < j) {
                arr[i] = arr[j];
                i++;
            }
            while (i < j && temp < arr[i]) {
                i++;
            }
            if (i < j) {
                arr[j] = arr[i];
                j--;
            }
        }
        arr[i] = temp;
        if (high < i) {
            jx(arr, high, i - 1);
        }
        if (i < low) {
            jx(arr, i + 1, low);
        }
    }
}
